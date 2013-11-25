
package exchange.v2007sp3.ws.client.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response Message for a single id conversion in the ConvertId web method.  Note
 *         that the AlternateId element will be missing in the case of an error.
 *       
 * 
 * <p>Java class for ConvertIdResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertIdResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="AlternateId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternateIdBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertIdResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "alternateId"
})
public class ConvertIdResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "AlternateId")
    protected AlternateIdBaseType alternateId;

    /**
     * Gets the value of the alternateId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdBaseType }
     *     
     */
    public AlternateIdBaseType getAlternateId() {
        return alternateId;
    }

    /**
     * Sets the value of the alternateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdBaseType }
     *     
     */
    public void setAlternateId(AlternateIdBaseType value) {
        this.alternateId = value;
    }

}
