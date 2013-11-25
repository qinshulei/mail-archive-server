
package exchange.v2007sp3.ws.client.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEmptyArrayOfItemChangesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfItemChangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemChange" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemChangeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfItemChangesType", propOrder = {
    "itemChange"
})
public class NonEmptyArrayOfItemChangesType {

    @XmlElement(name = "ItemChange", required = true)
    protected List<ItemChangeType> itemChange;

    /**
     * Gets the value of the itemChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemChangeType }
     * 
     * 
     */
    public List<ItemChangeType> getItemChange() {
        if (itemChange == null) {
            itemChange = new ArrayList<ItemChangeType>();
        }
        return this.itemChange;
    }

}
