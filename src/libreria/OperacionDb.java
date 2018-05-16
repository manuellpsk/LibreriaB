package libreria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.Oracleconx;

public class OperacionDb {
    
    private static String query=null;
    private static Libros libro;
    private static Autores autor;
    private static Detalle detalle;
    Oracleconx c=new Oracleconx();
    private static Connection cn=null;
    private static ArrayList<Libros> alist=new ArrayList<Libros>();
    private static ArrayList<Autores> aulist=new ArrayList<Autores>();
    private static ArrayList<Detalle> detlist=new ArrayList<Detalle>();
    
    
    public void setAlist(){
        alist.clear();
    }
    public void setAulist(){
        aulist.clear();
    }
    public void setDetlist(){
        detlist.clear();
    }
    private  static  String  fechaTodma(String fecha){
        
        /*  fecha.subString(0,4)+*/
        return fecha.substring(8,10)+String.valueOf(fecha.charAt(7))+fecha.substring(5,7)+String.valueOf(fecha.charAt(4))+fecha.substring(0,4);
    }
    /*30-05-1977*/
    private  static  String  fechaTomda(String fecha){
        
        /*  fecha.subString(0,4)+*/
        return fecha.substring(3,5)+String.valueOf(fecha.charAt(2))+fecha.substring(0,2)+String.valueOf(fecha.charAt(5))+fecha.substring(6,10);
    }
    private static int contarRs(ResultSet rs){
    
        int cant=0;
        try {
            rs.last();
            cant=rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
    }
    /* querys libros*/
    public ArrayList<Libros> mostrarTodo(){
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA.LIBROS";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                libro=new Libros(Long.parseLong(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3)),Integer.parseInt(rs.getString(4)),
                fechaTodma(rs.getString(5).substring(0,10)),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                alist.add(libro);
            }
            if(alist.isEmpty()){
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return alist;
    }
    public Libros buscarLibro(String isbn){
    
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA.LIBROS WHERE ISBN="+isbn+"";
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                libro=new Libros(Long.parseLong(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3)),Integer.parseInt(rs.getString(4)),
                        fechaTodma(rs.getString(5).substring(0,10)),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
            }else{
                System.out.println("No hay registros para mostrar");
            }
            cn.close();
        } catch (SQLException ex) {
                System.out.println("Error en OperacionesDb SQL");
        }
        finally{
            return libro;
        }
        
    }
    
    public boolean agregarLibro(Libros libro){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="INSERT INTO LIBRERIABETA.LIBROS VALUES("+libro.getCodisbn()+",'"+libro.getTitulo()+"',"+libro.getNumpag()+
                  ","+libro.getPrecio()+",'"+libro.getAño()+"',"+libro.getCategoria()+","+libro.getAutor()+","+libro.getIdioma()+","+
                  libro.getEditorial()+")";
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no inserto");
            }else{
                System.out.println("Ingreso correcto");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
                Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return estado;
    }
    
    public boolean modificarLibro(Libros libro){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="UPDATE LIBRERIABETA.LIBROS SET TITULO='"+libro.getTitulo()+"',NUMPAG="+libro.getNumpag()+
                    ",PRECIOREF="+libro.getPrecio()+",AÑO='"+libro.getAño()+"',CATEGORIA="+libro.getCategoria()+
                    ",AUTOR="+libro.getAutor()+",IDIOMA="+libro.getIdioma()+",EDITORIAL="+libro.getEditorial()+
                    " WHERE ISBN="+libro.getCodisbn();
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no modifico");
            }else{
                System.out.println("modifico corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
                Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return estado;
    }
    
    public boolean eliminarLibro(String isbn){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="DELETE FROM LIBRERIABETA.LIBROS WHERE ISBN="+isbn;
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no elimino");
            }else{
                System.out.println("elimino corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
                Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return estado;
    }
    /*querys autores*/
    
    public ArrayList<Autores> mostrarTodoaut(){
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA.AUTORES";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                autor=new Autores(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4));
                aulist.add(autor);
            }
            if(aulist.isEmpty()){
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return aulist;
    }

    public Autores buscarAutor(String codaut){
    
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA.AUTORES WHERE CODAUT="+codaut+"";
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                autor=new Autores(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4));
                
            }else{
                System.out.println("No hay registros para mostrar");
            }
            cn.close();
        } catch (SQLException ex) {
                System.out.println("Error en OperacionesDb SQL");
        }
        finally{
            return autor;
        }
        
    }
    
    public boolean modificarAutor(Autores a){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="UPDATE LIBRERIABETA.AUTORES SET NOMBRE='"+a.getNombre()+"',APELLIDOP='"+a.getApp()+"',APELLIDOM='"+a.getApm()+"' "+
                    "WHERE CODAUT="+a.getCodaut();
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no modifico");
            }else{
                System.out.println("modifico corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
            
        
        return estado;
    }
    
    public boolean agregarAutor(Autores a){
    
        boolean estado=false;
        try {
            if(a.getNombre().isEmpty()){a.setNombre("null");}  
            if(a.getApm().isEmpty()){a.setApm("null");}
            if(a.getApp().isEmpty()){a.setApp("null");}
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="INSERT INTO LIBRERIABETA.AUTORES VALUES("+a.getCodaut()+",'"+a.getNombre()+"','"+a.getApp()+
                  "','"+a.getApm()+"')";
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no inserto");
            }else{
                System.out.println("Ingreso correcto");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
            
        
        return estado;
    }
    
    public boolean eliminarAutor(String codaut){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="DELETE FROM LIBRERIABETA.AUTORES WHERE CODAUT="+codaut;
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no elimino");
            }else{
                System.out.println("elimino corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
            
        
        return estado;
    }
    
    public ArrayList<Detalle> mostrarTododet(String table){
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA."+table.toUpperCase();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                detalle=new Detalle(rs.getInt(1),rs.getString(2));
                detlist.add(detalle);
            }
            if(detlist.isEmpty()){
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return detlist;
    }

    public Detalle buscarDetalle(String table,String cod){
    
        
        try {
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="SELECT * FROM LIBRERIABETA."+table.toUpperCase()+" WHERE CODIGO="+cod+"";
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                detalle=new Detalle(Integer.parseInt(rs.getString(1)),rs.getString(2));
                
            }else{
                System.out.println("No hay registros para mostrar");
            }
            cn.close();
        } catch (SQLException ex) {
                System.out.println("Error en OperacionesDb SQL");
        }
        finally{
            return detalle;
        }
        
    }
    
    public boolean modificarDetalle(String table,Detalle d){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="UPDATE LIBRERIABETA."+table.toUpperCase()+" SET NOMBRE='"+d.getNombre()+"'"+
                    " WHERE CODIGO="+d.getCodigo();
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no modifico");
            }else{
                System.out.println("modifico corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean agregarDetalle(String table,Detalle d){
    
        boolean estado=false;
        try {
            if(d.getNombre().isEmpty()){d.setNombre("null");}  
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            query="INSERT INTO LIBRERIABETA."+table.toUpperCase()+" VALUES("+d.getCodigo()+",'"+d.getNombre()+"')";
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no inserto");
            }else{
                System.out.println("Ingreso correcto");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean eliminarDetalle(String table,String codigo){
    
        boolean estado=false;
        try {
                
            Oracleconx con=c.conectar();
            cn=con.getConexion();
            Statement st=cn.createStatement();
            query="DELETE FROM LIBRERIABETA."+table.toUpperCase()+" WHERE CODIGO="+codigo;
            System.out.println(query);
            int f=st.executeUpdate(query);
            if(f!=1){
                System.out.println("no elimino");
            }else{
                System.out.println("elimino corrrectamente");estado=true;
            }
        cn.close();    
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
            
        
        return estado;
    }

}
