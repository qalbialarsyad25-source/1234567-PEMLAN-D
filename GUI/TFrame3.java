import java.awt.*;
import java.awt.event.*;

// ================== CLASS UTAMA ==================
public class TFrame3 extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Checkbox ASD, Pemlan, Matkomlan, Probstat;
    Button btnhasil, btnTampil;
    TextArea txtArea;

    String semuaNilai = "";

    public TFrame3(){
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(110, 30, 170, 20);

        cbg = new CheckboxGroup(); 

        ASD = new Checkbox("ASD", cbg, false); 
        add(ASD).setBounds(30, 60, 90, 20);

        Pemlan = new Checkbox("Pemlan", cbg, false); 
        add(Pemlan).setBounds(120, 60, 80, 20);

        Matkomlan = new Checkbox("Matkomlan", cbg, false); 
        add(Matkomlan).setBounds(210, 60, 100, 20);

        Probstat = new Checkbox("Probstat", cbg, false); 
        add(Probstat).setBounds(320, 60, 90, 20);

        ASD.addItemListener(new mainAction()); 
        Pemlan.addItemListener(new mainAction()); 
        Matkomlan.addItemListener(new mainAction());
        Probstat.addItemListener(new mainAction());

        lbTugas = new Label("Tugas : "); 
        add(lbTugas); 
        lbTugas.setBounds(100, 90, 62, 20); 

        lbKuis = new Label("Kuis : "); 
        add(lbKuis);
        lbKuis.setBounds(100, 120, 70, 20); 

        lbUTS = new Label("UTS : "); 
        add(lbUTS); 
        lbUTS.setBounds(100, 150, 70, 20); 

        lbUAS = new Label("UAS : "); 
        add(lbUAS); 
        lbUAS.setBounds(100, 180, 70, 20); 

        lbHasil = new Label("Hasil : "); 
        add(lbHasil); 
        lbHasil.setBounds(100, 210, 70, 20); 

        txtTugas = new TextField("0"); 
        add(txtTugas); 
        txtTugas.setBounds(200, 90, 60, 20); 

        txtKuis = new TextField("0"); 
        add(txtKuis); 
        txtKuis.setBounds(200, 120, 60, 20); 

        txtUTS = new TextField("0"); 
        add(txtUTS); 
        txtUTS.setBounds(200, 150, 60, 20); 

        txtUAS = new TextField("0"); 
        add(txtUAS); 
        txtUAS.setBounds(200, 180, 60, 20); 

        txtHasil = new TextField("0"); 
        add(txtHasil); 
        txtHasil.setBounds(200, 210, 60, 20); 

        btnhasil = new Button("Hitung");
        add(btnhasil);
        btnhasil.setBounds(120, 240, 100, 20);
        btnhasil.addActionListener(new ButtonAction());

        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(80, 380, 220, 25);
        btnTampil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtArea.setText(semuaNilai);
            }
        });

        // TEXT AREA
        txtArea = new TextArea();
        add(txtArea);
        txtArea.setBounds(50, 270, 300, 100);

        // FRAME SETTING
        setSize(400, 420);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    // ================== EVENT RADIO BUTTON ==================
    class mainAction implements ItemListener {
        public void itemStateChanged(ItemEvent e){
            txtTugas.setText("0");
            txtKuis.setText("0");
            txtUTS.setText("0");
            txtUAS.setText("0");
            txtHasil.setText("0");
        }
    }

    // ================== EVENT BUTTON ==================
    class ButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e){
            hitung();
        }
    }

    // ================== LOGIC ==================
    void hitung(){
        try {
            int tugas = Integer.parseInt(txtTugas.getText().trim());
            int kuis = Integer.parseInt(txtKuis.getText().trim());
            int UTS = Integer.parseInt(txtUTS.getText().trim()); 
            int UAS = Integer.parseInt(txtUAS.getText().trim()); 

            MataKuliah mk = null;
            String nama = "";

            if (ASD.getState()) {
                mk = new ASDmk(tugas, kuis, UTS, UAS);
                nama = "ASD";
            } else if (Pemlan.getState()) {
                mk = new Pemlanmk(tugas, kuis, UTS, UAS);
                nama = "Pemlan";
            } else if (Matkomlan.getState()) {
                mk = new Matkomlanmk(tugas, kuis, UTS, UAS);
                nama = "Matkomlan";
            } else if (Probstat.getState()) {
                mk = new Probstatmk(tugas, kuis, UTS, UAS);
                nama = "Probstat";
            }

            if (mk == null) {
                txtHasil.setText("Pilih MK!");
                return;
            }

            double hasil = mk.hitung();
            txtHasil.setText(String.valueOf(hasil));

            semuaNilai += nama + " : " + hasil + "\n";

        } catch (Exception ex) {
            txtHasil.setText("Input Salah");
        }
    }
}

// ================== CLASS OOP ==================

abstract class MataKuliah {
    int tugas, kuis, uts, uas;

    MataKuliah(int t, int k, int u, int ua){
        tugas = t;
        kuis = k;
        uts = u;
        uas = ua;
    }

    abstract double hitung();
}

class ASDmk extends MataKuliah {
    ASDmk(int t, int k, int u, int ua){ super(t,k,u,ua); }
    double hitung(){ return tugas*0.2 + kuis*0.2 + uts*0.3 + uas*0.3; }
}

class Pemlanmk extends MataKuliah {
    Pemlanmk(int t, int k, int u, int ua){ super(t,k,u,ua); }
    double hitung(){ return tugas*0.3 + kuis*0.2 + uts*0.2 + uas*0.3; }
}

class Matkomlanmk extends MataKuliah {
    Matkomlanmk(int t, int k, int u, int ua){ super(t,k,u,ua); }
    double hitung(){ return (tugas + kuis + uts + uas) / 4.0; }
}

class Probstatmk extends MataKuliah {
    Probstatmk(int t, int k, int u, int ua){ super(t,k,u,ua); }
    double hitung(){ return tugas*0.1 + kuis*0.2 + uts*0.3 + uas*0.4; }
}