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
public class LocalDetails {
    @Column(name = "INVOICE_NUMBER", length = 50)
    private String invoiceNumber;

    @Column(name = "INVOICE_PRICE", length = 11)
    private Integer invoicePrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INVOICE_DATE")
    private Date invoiceDate;
}
