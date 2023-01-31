package es.iesjandula.reservascarritos.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reserva_carrito_tablets")
public class ReservaCarritoTablets
{
    @EmbeddedId
    private ReservaCarritoTabletsId reservaCarritoTabletsId;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    @MapsId("idProfesor")
    private Profesor idProfesor;

    @ManyToOne
    @JoinColumn(name = "id_carrito_tablets")
    @MapsId("idCarritoTablets")
    private CarritoTablets idCarritoTablets;

    @Column(length = 25, nullable = false)
    private String ubicacionPrestamo;

    public ReservaCarritoTablets()
    {
    }

    public ReservaCarritoTablets(ReservaCarritoTabletsId reservaCarritoTabletsId, Profesor idProfesor, CarritoTablets idCarritoTablets, String ubicacionPrestamo)
    {
        this.reservaCarritoTabletsId = reservaCarritoTabletsId;
        this.idProfesor = idProfesor;
        this.idCarritoTablets = idCarritoTablets;
        this.ubicacionPrestamo = ubicacionPrestamo;
    }

    public ReservaCarritoTabletsId getReservaCarritoTabletsId()
    {
        return reservaCarritoTabletsId;
    }

    public void setReservaCarritoTabletsId(ReservaCarritoTabletsId reservaCarritoTabletsId)
    {
        this.reservaCarritoTabletsId = reservaCarritoTabletsId;
    }

    public Profesor getIdProfesor()
    {
        return idProfesor;
    }

    public void setIdProfesor(Profesor idProfesor)
    {
        this.idProfesor = idProfesor;
    }

    public CarritoTablets getIdCarritoTablets()
    {
        return idCarritoTablets;
    }

    public void setIdCarritoTablets(CarritoTablets idCarritoTablets)
    {
        this.idCarritoTablets = idCarritoTablets;
    }

    public String getUbicacionPrestamo()
    {
        return ubicacionPrestamo;
    }

    public void setUbicacionPrestamo(String ubicacionPrestamo)
    {
        this.ubicacionPrestamo = ubicacionPrestamo;
    }
}
