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
public class LocalImportedDetails{
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SALE_CERTIFICATE_DATE")
    private Date saleCertificateDate;

    @Column(name = "SALE_CERTIFICATE_NUMBER", length = 50)
    private String saleCertificateNumber;
}
