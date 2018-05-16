package frames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import libreria.Autores;
import libreria.Detalle;
import libreria.Libros;

public class TablaL extends javax.swing.JFrame {
    
    JTable miTabla;
    JScrollPane mibarra;
    public TablaL() {
        this.setSize(500,300);
        setTitle("Tabla");
        setLocationRelativeTo(null);
        setResizable(true);
        initComponents();
        ic2();
    }
    
    public void crearTablaL(ArrayList<Libros> alist,String title[]){
        
        String info[][]=matrizl(alist);
        miTabla=new JTable(info,title);
        mibarra.setViewportView(miTabla);
    }
    private String[][] matrizl(ArrayList<Libros> alist){
        String [][] mat=new String[alist.size()][4];
        for(int i=0;i<alist.size();i++){
            mat[i][0]=alist.get(i).getCodisbn()+"";
            mat[i][1]=alist.get(i).getTitulo()+"";
            mat[i][2]=alist.get(i).getAutor()+"";
            mat[i][3]=alist.get(i).getPrecio()+"";
        }
        return mat;
    }
    public void crearTablaAu(ArrayList<Autores> aulist,String title[]){
        
        String info[][]=matrizau(aulist);
        miTabla=new JTable(info,title);
        mibarra.setViewportView(miTabla);
    }
    
    private String[][] matrizau(ArrayList<Autores> aulist){
        String [][] mat=new String[aulist.size()][4];
        for(int i=0;i<aulist.size();i++){
            mat[i][0]=aulist.get(i).getCodaut()+"";
            mat[i][1]=aulist.get(i).getNombre()+"";
            mat[i][2]=aulist.get(i).getApp()+"";
            mat[i][3]=aulist.get(i).getApm()+"";
        }
        return mat;
    }
    
    public void crearTableDet(ArrayList<Detalle> detlist,String title[]){
    
        String info[][]=matrizdet(detlist);
        miTabla=new JTable(info,title);
        mibarra.setViewportView(miTabla);
    }
    
    private String[][] matrizdet(ArrayList<Detalle> detlist){
        String [][] mat=new String[detlist.size()][4];
        for(int i=0;i<detlist.size();i++){
            mat[i][0]=detlist.get(i).getCodigo()+"";
            mat[i][1]=detlist.get(i).getNombre()+"";
            
        }
        return mat;
    }
    
    private void ic2(){
        mibarra=new JScrollPane();
        mibarra.setBounds(27, 72, 379, 130);
        getContentPane().add(mibarra);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
