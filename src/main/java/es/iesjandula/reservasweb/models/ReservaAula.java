package es.iesjandula.reservascarritos.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reserva_aula")
public class ReservaAula
{
    @EmbeddedId
    private ReservaAulaId reservaAulaId;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    @MapsId("idProfesor")
    private Profesor idProfesor;

    @ManyToOne
    @JoinColumn(name = "id_aula_informatica")
    @MapsId("idAulaInformatica")
    private AulaInformatica idAulaInformatica;

    public ReservaAula()
    {
    }

    public ReservaAula(ReservaAulaId reservaAulaId, Profesor idProfesor, AulaInformatica idAulaInformatica)
    {
        this.reservaAulaId = reservaAulaId;
        this.idProfesor = idProfesor;
        this.idAulaInformatica = idAulaInformatica;
    }

    public ReservaAulaId getReservaAulaId()
    {
        return reservaAulaId;
    }

    public void setReservaAulaId(ReservaAulaId reservaAulaId)
    {
        this.reservaAulaId = reservaAulaId;
    }

    public Profesor getIdProfesor()
    {
        return idProfesor;
    }

    public void setIdProfesor(Profesor idProfesor)
    {
        this.idProfesor = idProfesor;
    }

    public AulaInformatica getIdAulaInformatica()
    {
        return idAulaInformatica;
    }

    public void setIdAulaInformatica(AulaInformatica idAulaInformatica)
    {
        this.idAulaInformatica = idAulaInformatica;
    }

}
