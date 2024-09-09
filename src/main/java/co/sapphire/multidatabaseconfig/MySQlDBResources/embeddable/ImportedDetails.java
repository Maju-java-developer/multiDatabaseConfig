package co.sapphire.multidatabaseconfig.MySQlDBResources.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Embeddable
public class ImportedDetails {
    @Column(name = "BOE_NUMBER", length = 20)
    private String boeNumber;

    @Column(name = "MACHINE_NUMBER", length = 20)
    private String machineNumber;

    @Column(name = "INDEX_NUMBER", length = 20)
    private String indexNumber;

    @Column(name = "CASH_NUMBER", length = 20)
    private String cashNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BOE_DATE")
    private Date boeDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MACHINE_DATE")
    private Date machineDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INDEX_DATE")
    private Date indexDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CASH_DATE")
    private Date cashDate;
}
