package ar.com.educacionit.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cupones")
public class Cupones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre",length = 100, nullable = false)
    private String nombre;

    @Column(name="codigo",length = 10, nullable = false,unique = true)
    private String codigo;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name="fecha_vigencia_desde")
    private Date fechaVigenciaDesde;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name="fecha_vigencia_hasta")
    private Date fecha_vigencia_hasta;

    @Column(name="descuento")
    private Long descuento;



    public Cupones() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVigenciaDesde() {
        return fechaVigenciaDesde;
    }

    public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
        this.fechaVigenciaDesde = fechaVigenciaDesde;
    }

    public Date getFecha_vigencia_hasta() {
        return fecha_vigencia_hasta;
    }

    public void setFecha_vigencia_hasta(Date fecha_vigencia_hasta) {
        this.fecha_vigencia_hasta = fecha_vigencia_hasta;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

}
