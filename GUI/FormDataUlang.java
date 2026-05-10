import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FormDataUlang extends JFrame {
    JLabel lblnama = new JLabel("Nama Lengkap");
    JTextField txnama = new JTextField(30);
    JLabel lbltanggallahir = new JLabel("Tanggal Lahir");
    JTextField txtanggallahir = new JTextField(7);
    JLabel lblnomorpendaftaran = new JLabel("Nomor Pendaftaran");
    JTextField txnomorpendaftaran = new JTextField(30);
    JLabel lblnomortelepon = new JLabel("No. Telp");
    JTextField txnomortelepon = new JTextField(12);
    JLabel lblalamat = new JLabel("Alamat");
    JTextField txalamat = new JTextField(50);
    JLabel lblemail = new JLabel("E-mail");
    JTextField txemail = new JTextField(30);
    JButton submit = new JButton("Submit");
    JTextArea hasil = new JTextArea();

    FormDataUlang(){
        setTitle("DATA MAHASISWA");
        setLocation(300,100);
        setSize(300, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void KomponenVisual1(){
        getContentPane().add(lblnama);
        lblnama.setBounds(10,10,80,20);
        getContentPane().add(txnama);
        txnama.setBounds(105,10,175,20);
        getContentPane().add(lbltanggallahir);
        lbltanggallahir.setBounds(10,33,80,20);
        getContentPane().add(txtanggallahir);
        txtanggallahir.setBounds(105,33,70,20);
        getContentPane().add(lblnomorpendaftaran);
        lblnomorpendaftaran.setBounds(10,56,80,20);
        getContentPane().add(txnomorpendaftaran);
        txnomorpendaftaran.setBounds(105,56,70,20);
        getContentPane().add(lblnomortelepon);
        lblnomortelepon.setBounds(10,79,80,20);
        getContentPane().add(txnomortelepon);
        txnomortelepon.setBounds(105,79,70,20);
        getContentPane().add(lblalamat);
        lblalamat.setBounds(10,102,80,20);
        getContentPane().add(txalamat);
        txalamat.setBounds(105,102,70,20);
        getContentPane().add(lblemail);
        lblemail.setBounds(10,125,80,20);
        getContentPane().add(txemail);
        txemail.setBounds(105,125,70,20);
        getContentPane().add(submit);
        submit.setBounds(10,148,270,20);
        getContentPane().add(hasil);
        hasil.setBounds(10,171,270,140);
        setVisible(true);
    }

    void Aksi(){
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                hasil.append(lblnama.getText() + " : " + txnama.getText() + "\n");
                hasil.append(lbltanggallahir.getText() + " : " + txtanggallahir.getText() + "\n");
                hasil.append(lblnomorpendaftaran.getText() + " : " + txnomorpendaftaran.getText() + "\n");
                hasil.append(lblnomortelepon.getText() + " : " + txnomortelepon.getText() + "\n");
                hasil.append(lblalamat.getText() + " : " + txalamat.getText() + "\n");
                hasil.append(lblemail.getText() + " : " + txemail.getText() + "\n");
            }
        });
    }
}