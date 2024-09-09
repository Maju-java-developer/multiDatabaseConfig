package co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy;

import co.sapphire.multidatabaseconfig.MySQlDBResources.embeddable.ImportedDetails;
import co.sapphire.multidatabaseconfig.MySQlDBResources.embeddable.LocalDetails;
import co.sapphire.multidatabaseconfig.MySQlDBResources.embeddable.LocalImportedDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;
/**
 * Entity Class Of Vehicle Entity.
 *
 * @since 01-06-2023
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "VEHICLES")
public class VehicleEntity {
    // UUID fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;
    // String fields
    @Column(name = "REGISTRATION_NUMBER", length = 50, nullable = false, unique = true)
    private String registrationNumber;

    @Column(name = "CHASSIS_NUMBER", length = 100, unique = true, nullable = false)
    private String chassisNumber;

    @Column(name = "ETO_REMARKS")
    private String etoRemarks;

    @Column(name = "PO_APPROVED_BY", length = 50)
    private String poApprovedBy;

    @Column(name = "INSPECTOR_USER_NAME", length = 50)
    private String inspectorUserName;

    @Column(name = "CARD_NUMBER", length = 50)
    private String cardNumber;

    @Column(name = "VEHICLE_STATUS", length = 50)
    private String vehicleStatus;

    @Column(name = "SEQUENCE_ISSUANCE_DETAIL_ID", length = 50)
    private String sequenceIssuanceDetailId;

    @Column(name = "ETO_USER_NAME", length = 50)
    private String etoUserName;

    @Column(name = "OWNER_MOBILE_NUMBER", nullable = false, length = 50)
    private String ownerMobileNumber;

    @Column(name = "OWNER_ADDRESS", nullable = false, length = 250)
    private String ownerAddress;

    @Column(name = "HPA_NAME", length = 30)
    private String hpaName;

    @Column(name = "HPA_INSTRUCTION", length = 50)
    private String hpaInstruction;

    @Column(name = "HPA_REMARKS", length = 30)
    private String hpaRemarks;

    @Column(name = "TAX_CLASS", length = 10)
    private String taxClass;

    @Column(name = "IMPORT_PERMIT_NUMBER", length = 20)
    private String importPermitNumber;

    @Column(name = "KPT_CHALLAN_NUMBER", length = 250)
    private String kptChallanNumber;

    @Column(name = "CVT_EXEMPTED_OR_RECOVERED", length = 250)
    private String cvtExemptedOrRecovered;

    @Column(name = "VEHICLE_INSPECTED_BY", length = 50)
    private String vehicleInspectedBy;

    @Column(name = "INSURANCE", length = 22)
    private String insurance;

    @Column(name = "OCT_REC_NUMBER", length = 50)
    private String octRecNumber;

    @Column(name = "ENGINE_NUMBER", length = 20, nullable = false, unique = true)
    private String engineNumber;

    @Column(name = "ENTRY_TIMESTAMP", length = 50)
    private String entryTimestamp;
    // Integer fields
    @Column(name = "ENGINE_CAPACITY", length = 10)
    private Integer engineCapacity;

    @Column(name = "VEHICLE_PRICE", length = 11)
    private Integer vehiclePrice;

    @Column(name = "IMPORT_VALUE", length = 11)
    private Integer importValue;

    @Column(name = "CUSTOM_DUTY", length = 11)
    private Integer customDuty;

    @Column(name = "IMPLIC_FEE", length = 11)
    private Integer implicFee;

    @Column(name = "CAPITAL_VALUE", length = 11)
    private Integer capitalValue;

    @Column(name = "UNLADEN_WEIGHT", length = 10)
    private Integer unladenWeight;

    @Column(name = "LADEN_WEIGHT", length = 10)
    private Integer ladenWeight;

    @Column(name = "IS_HIGHWAY")
    private Integer isHighway;
    // Short fields
    @Column(name = "NUMBER_OF_SEATS", length = 5)
    private Short seats;

    @Column(name = "NO_OF_CYLINDER", length = 10)
    private Short noOfCylinder;
    // Boolean fields
    @Column(name = "IS_PO_APPROVED")
    private Boolean isPoApproved;

    @Column(name = "IS_CANCEL")
    private Boolean isCancel;
    // Date fields
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ETO_ACTION_TIMESTAMP")
    private Date etoActionTimestamp;

    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_TAX_PAID")
    private Date lastTaxPaid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HPA_UPDATED_TIMESTAMP")
    private Date hpaUpdatedTimestamp;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CVT_DATE")
    private Date cvtDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KPT_CHALLAN_DATE")
    private Date kptChallanDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OCT_REC_DATE")
    private Date octRecDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DEALER_LETTER_DATE")
    private Date dealerLetterDate;

    @Column(name = "PO_APPROVED_DATE")
    private Date poApprovedDate;

    @Column(name = "MANUFACTURER_YEAR")
    private String manufacturerYear;

    @Column(name = "MODEL_YEAR")
    private String modelYear;
    @Embedded
    private LocalDetails localDetails;
    @Embedded
    private ImportedDetails importedDetails;
    @Embedded
    private LocalImportedDetails localImportedDetails;
}