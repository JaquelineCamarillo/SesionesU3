package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumn {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    @Column(length = 100,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int age;

    public long getID() {
        return ID;
    }
    public int getAge() {
        return age;
    }
    public String getNombre() {
        return nombre;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setID(long iD) {
        ID = iD;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
