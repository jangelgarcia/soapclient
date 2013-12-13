/*
 * XML Type:  TGetInfo_Return
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TGetInfoReturn
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model.impl;
/**
 * An XML TGetInfo_Return(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public class TGetInfoReturnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.model.TGetInfoReturn
{
    
    public TGetInfoReturnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("", "Path");
    private static final javax.xml.namespace.QName ALIAS$2 = 
        new javax.xml.namespace.QName("", "Alias");
    private static final javax.xml.namespace.QName CLASS1$4 = 
        new javax.xml.namespace.QName("", "Class");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName TEXT$10 = 
        new javax.xml.namespace.QName("", "Text");
    private static final javax.xml.namespace.QName KEYWORDS$12 = 
        new javax.xml.namespace.QName("", "Keywords");
    private static final javax.xml.namespace.QName MAINCHARACTERISTICS$14 = 
        new javax.xml.namespace.QName("", "MainCharacteristics");
    private static final javax.xml.namespace.QName TITLE$16 = 
        new javax.xml.namespace.QName("", "Title");
    private static final javax.xml.namespace.QName TAXCLASS$18 = 
        new javax.xml.namespace.QName("", "TaxClass");
    private static final javax.xml.namespace.QName ISVISIBLE$20 = 
        new javax.xml.namespace.QName("", "IsVisible");
    private static final javax.xml.namespace.QName ISNEW$22 = 
        new javax.xml.namespace.QName("", "IsNew");
    private static final javax.xml.namespace.QName ISDAILYPRICE$24 = 
        new javax.xml.namespace.QName("", "IsDailyPrice");
    private static final javax.xml.namespace.QName ORDERUNIT$26 = 
        new javax.xml.namespace.QName("", "OrderUnit");
    private static final javax.xml.namespace.QName PRICEQUANTITY$28 = 
        new javax.xml.namespace.QName("", "PriceQuantity");
    private static final javax.xml.namespace.QName MINORDER$30 = 
        new javax.xml.namespace.QName("", "MinOrder");
    private static final javax.xml.namespace.QName INTERVALORDER$32 = 
        new javax.xml.namespace.QName("", "IntervalOrder");
    private static final javax.xml.namespace.QName WEIGHTUNIT$34 = 
        new javax.xml.namespace.QName("", "WeightUnit");
    private static final javax.xml.namespace.QName WEIGHT$36 = 
        new javax.xml.namespace.QName("", "Weight");
    private static final javax.xml.namespace.QName REFUNIT$38 = 
        new javax.xml.namespace.QName("", "RefUnit");
    private static final javax.xml.namespace.QName REFAMOUNT$40 = 
        new javax.xml.namespace.QName("", "RefAmount");
    private static final javax.xml.namespace.QName REFCONTENTAMOUNT$42 = 
        new javax.xml.namespace.QName("", "RefContentAmount");
    private static final javax.xml.namespace.QName STOCKLEVEL$44 = 
        new javax.xml.namespace.QName("", "StockLevel");
    private static final javax.xml.namespace.QName STOCKLEVELALERT$46 = 
        new javax.xml.namespace.QName("", "StockLevelAlert");
    private static final javax.xml.namespace.QName MANUFACTURER$48 = 
        new javax.xml.namespace.QName("", "Manufacturer");
    private static final javax.xml.namespace.QName MANUFACTURERSKU$50 = 
        new javax.xml.namespace.QName("", "ManufacturerSKU");
    private static final javax.xml.namespace.QName DELIVERYPERIOD$52 = 
        new javax.xml.namespace.QName("", "DeliveryPeriod");
    private static final javax.xml.namespace.QName LENGTH$54 = 
        new javax.xml.namespace.QName("", "Length");
    private static final javax.xml.namespace.QName WIDTH$56 = 
        new javax.xml.namespace.QName("", "Width");
    private static final javax.xml.namespace.QName HEIGHT$58 = 
        new javax.xml.namespace.QName("", "Height");
    private static final javax.xml.namespace.QName WEBURL$60 = 
        new javax.xml.namespace.QName("", "WebUrl");
    private static final javax.xml.namespace.QName ISAVAILABLE$62 = 
        new javax.xml.namespace.QName("", "IsAvailable");
    private static final javax.xml.namespace.QName AVAILABILITYCOMMENT$64 = 
        new javax.xml.namespace.QName("", "AvailabilityComment");
    private static final javax.xml.namespace.QName AVAILABILITYDATE$66 = 
        new javax.xml.namespace.QName("", "AvailabilityDate");
    private static final javax.xml.namespace.QName URI$68 = 
        new javax.xml.namespace.QName("", "URI");
    private static final javax.xml.namespace.QName CANONICALURL$70 = 
        new javax.xml.namespace.QName("", "CanonicalURL");
    private static final javax.xml.namespace.QName ISDOWNLOADPRODUCT$72 = 
        new javax.xml.namespace.QName("", "IsDownloadProduct");
    private static final javax.xml.namespace.QName MAXDOWNLOADTIME$74 = 
        new javax.xml.namespace.QName("", "MaxDownloadTime");
    private static final javax.xml.namespace.QName MAXDOWNLOADCOUNT$76 = 
        new javax.xml.namespace.QName("", "MaxDownloadCount");
    private static final javax.xml.namespace.QName DOWNLOADPRODUCTMAPS$78 = 
        new javax.xml.namespace.QName("", "DownloadProductMaps");
    private static final javax.xml.namespace.QName SUPERPRODUCT$80 = 
        new javax.xml.namespace.QName("", "SuperProduct");
    private static final javax.xml.namespace.QName SUBPRODUCTS$82 = 
        new javax.xml.namespace.QName("", "SubProducts");
    private static final javax.xml.namespace.QName DEFAULTSUBPRODUCT$84 = 
        new javax.xml.namespace.QName("", "DefaultSubProduct");
    private static final javax.xml.namespace.QName ISDEFAULT$86 = 
        new javax.xml.namespace.QName("", "IsDefault");
    private static final javax.xml.namespace.QName HASSUBOWNPRICES$88 = 
        new javax.xml.namespace.QName("", "HasSubOwnPrices");
    private static final javax.xml.namespace.QName VARIATIONATTRIBUTES$90 = 
        new javax.xml.namespace.QName("", "VariationAttributes");
    private static final javax.xml.namespace.QName PRODUCTPRICES$92 = 
        new javax.xml.namespace.QName("", "ProductPrices");
    private static final javax.xml.namespace.QName MANUFACTURERPRICES$94 = 
        new javax.xml.namespace.QName("", "ManufacturerPrices");
    private static final javax.xml.namespace.QName DEPOSITPRICES$96 = 
        new javax.xml.namespace.QName("", "DepositPrices");
    private static final javax.xml.namespace.QName ECOPARTICIPATIONPRICES$98 = 
        new javax.xml.namespace.QName("", "EcoParticipationPrices");
    private static final javax.xml.namespace.QName PREPAYMENTPRICES$100 = 
        new javax.xml.namespace.QName("", "PrepaymentPrices");
    private static final javax.xml.namespace.QName PREPAYMENTTYPE$102 = 
        new javax.xml.namespace.QName("", "PrepaymentType");
    private static final javax.xml.namespace.QName PREPAYMENTVALUE$104 = 
        new javax.xml.namespace.QName("", "PrepaymentValue");
    private static final javax.xml.namespace.QName SHIPPINGMETHODS$106 = 
        new javax.xml.namespace.QName("", "ShippingMethods");
    private static final javax.xml.namespace.QName ATTRIBUTES$108 = 
        new javax.xml.namespace.QName("", "Attributes");
    private static final javax.xml.namespace.QName ERROR$110 = 
        new javax.xml.namespace.QName("", "Error");
    
    
    /**
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$0);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "Path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$0);
            }
            target.set(path);
        }
    }
    
    /**
     * Gets the "Alias" element
     */
    public java.lang.String getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Alias" element
     */
    public org.apache.xmlbeans.XmlString xgetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Alias" element
     */
    public void setAlias(java.lang.String alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIAS$2);
            }
            target.setStringValue(alias);
        }
    }
    
    /**
     * Sets (as xml) the "Alias" element
     */
    public void xsetAlias(org.apache.xmlbeans.XmlString alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALIAS$2);
            }
            target.set(alias);
        }
    }
    
    /**
     * Gets the "Class" element
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Class" element
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Class" element
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$4);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "Class" element
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$4);
            }
            target.set(class1);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(de.epages.ws.common.model.ListOfLocalizedValues name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(NAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(de.epages.ws.common.model.ListOfLocalizedValues description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(DESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "Text" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$10) != 0;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(de.epages.ws.common.model.ListOfLocalizedValues text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(TEXT$10);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "Text" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(TEXT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$10, 0);
        }
    }
    
    /**
     * Gets the "Keywords" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(KEYWORDS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Keywords" element
     */
    public boolean isSetKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDS$12) != 0;
        }
    }
    
    /**
     * Sets the "Keywords" element
     */
    public void setKeywords(de.epages.ws.common.model.ListOfLocalizedValues keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(KEYWORDS$12, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(KEYWORDS$12);
            }
            target.set(keywords);
        }
    }
    
    /**
     * Appends and returns a new empty "Keywords" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(KEYWORDS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Keywords" element
     */
    public void unsetKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDS$12, 0);
        }
    }
    
    /**
     * Gets the "MainCharacteristics" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getMainCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(MAINCHARACTERISTICS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MainCharacteristics" element
     */
    public boolean isSetMainCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINCHARACTERISTICS$14) != 0;
        }
    }
    
    /**
     * Sets the "MainCharacteristics" element
     */
    public void setMainCharacteristics(de.epages.ws.common.model.ListOfLocalizedValues mainCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(MAINCHARACTERISTICS$14, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(MAINCHARACTERISTICS$14);
            }
            target.set(mainCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "MainCharacteristics" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewMainCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(MAINCHARACTERISTICS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "MainCharacteristics" element
     */
    public void unsetMainCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINCHARACTERISTICS$14, 0);
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(TITLE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$16) != 0;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(de.epages.ws.common.model.ListOfLocalizedValues title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(TITLE$16, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(TITLE$16);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "Title" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(TITLE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$16, 0);
        }
    }
    
    /**
     * Gets the "TaxClass" element
     */
    public java.lang.String getTaxClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCLASS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxClass" element
     */
    public org.apache.xmlbeans.XmlString xgetTaxClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXCLASS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "TaxClass" element
     */
    public boolean isSetTaxClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXCLASS$18) != 0;
        }
    }
    
    /**
     * Sets the "TaxClass" element
     */
    public void setTaxClass(java.lang.String taxClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCLASS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCLASS$18);
            }
            target.setStringValue(taxClass);
        }
    }
    
    /**
     * Sets (as xml) the "TaxClass" element
     */
    public void xsetTaxClass(org.apache.xmlbeans.XmlString taxClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXCLASS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXCLASS$18);
            }
            target.set(taxClass);
        }
    }
    
    /**
     * Unsets the "TaxClass" element
     */
    public void unsetTaxClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXCLASS$18, 0);
        }
    }
    
    /**
     * Gets the "IsVisible" element
     */
    public boolean getIsVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVISIBLE$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsVisible" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVISIBLE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsVisible" element
     */
    public boolean isSetIsVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVISIBLE$20) != 0;
        }
    }
    
    /**
     * Sets the "IsVisible" element
     */
    public void setIsVisible(boolean isVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVISIBLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVISIBLE$20);
            }
            target.setBooleanValue(isVisible);
        }
    }
    
    /**
     * Sets (as xml) the "IsVisible" element
     */
    public void xsetIsVisible(org.apache.xmlbeans.XmlBoolean isVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVISIBLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVISIBLE$20);
            }
            target.set(isVisible);
        }
    }
    
    /**
     * Unsets the "IsVisible" element
     */
    public void unsetIsVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVISIBLE$20, 0);
        }
    }
    
    /**
     * Gets the "IsNew" element
     */
    public boolean getIsNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNEW$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNew" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEW$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsNew" element
     */
    public boolean isSetIsNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNEW$22) != 0;
        }
    }
    
    /**
     * Sets the "IsNew" element
     */
    public void setIsNew(boolean isNew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNEW$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNEW$22);
            }
            target.setBooleanValue(isNew);
        }
    }
    
    /**
     * Sets (as xml) the "IsNew" element
     */
    public void xsetIsNew(org.apache.xmlbeans.XmlBoolean isNew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEW$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISNEW$22);
            }
            target.set(isNew);
        }
    }
    
    /**
     * Unsets the "IsNew" element
     */
    public void unsetIsNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNEW$22, 0);
        }
    }
    
    /**
     * Gets the "IsDailyPrice" element
     */
    public boolean getIsDailyPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDAILYPRICE$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDailyPrice" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDailyPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDAILYPRICE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDailyPrice" element
     */
    public boolean isSetIsDailyPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDAILYPRICE$24) != 0;
        }
    }
    
    /**
     * Sets the "IsDailyPrice" element
     */
    public void setIsDailyPrice(boolean isDailyPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDAILYPRICE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDAILYPRICE$24);
            }
            target.setBooleanValue(isDailyPrice);
        }
    }
    
    /**
     * Sets (as xml) the "IsDailyPrice" element
     */
    public void xsetIsDailyPrice(org.apache.xmlbeans.XmlBoolean isDailyPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDAILYPRICE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDAILYPRICE$24);
            }
            target.set(isDailyPrice);
        }
    }
    
    /**
     * Unsets the "IsDailyPrice" element
     */
    public void unsetIsDailyPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDAILYPRICE$24, 0);
        }
    }
    
    /**
     * Gets the "OrderUnit" element
     */
    public java.lang.String getOrderUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERUNIT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERUNIT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderUnit" element
     */
    public boolean isSetOrderUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERUNIT$26) != 0;
        }
    }
    
    /**
     * Sets the "OrderUnit" element
     */
    public void setOrderUnit(java.lang.String orderUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERUNIT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERUNIT$26);
            }
            target.setStringValue(orderUnit);
        }
    }
    
    /**
     * Sets (as xml) the "OrderUnit" element
     */
    public void xsetOrderUnit(org.apache.xmlbeans.XmlString orderUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERUNIT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERUNIT$26);
            }
            target.set(orderUnit);
        }
    }
    
    /**
     * Unsets the "OrderUnit" element
     */
    public void unsetOrderUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERUNIT$26, 0);
        }
    }
    
    /**
     * Gets the "PriceQuantity" element
     */
    public float getPriceQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEQUANTITY$28, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceQuantity" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPriceQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRICEQUANTITY$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "PriceQuantity" element
     */
    public boolean isSetPriceQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEQUANTITY$28) != 0;
        }
    }
    
    /**
     * Sets the "PriceQuantity" element
     */
    public void setPriceQuantity(float priceQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEQUANTITY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEQUANTITY$28);
            }
            target.setFloatValue(priceQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "PriceQuantity" element
     */
    public void xsetPriceQuantity(org.apache.xmlbeans.XmlFloat priceQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRICEQUANTITY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PRICEQUANTITY$28);
            }
            target.set(priceQuantity);
        }
    }
    
    /**
     * Unsets the "PriceQuantity" element
     */
    public void unsetPriceQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEQUANTITY$28, 0);
        }
    }
    
    /**
     * Gets the "MinOrder" element
     */
    public float getMinOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINORDER$30, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinOrder" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMinOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINORDER$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinOrder" element
     */
    public boolean isSetMinOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINORDER$30) != 0;
        }
    }
    
    /**
     * Sets the "MinOrder" element
     */
    public void setMinOrder(float minOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINORDER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINORDER$30);
            }
            target.setFloatValue(minOrder);
        }
    }
    
    /**
     * Sets (as xml) the "MinOrder" element
     */
    public void xsetMinOrder(org.apache.xmlbeans.XmlFloat minOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINORDER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINORDER$30);
            }
            target.set(minOrder);
        }
    }
    
    /**
     * Unsets the "MinOrder" element
     */
    public void unsetMinOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINORDER$30, 0);
        }
    }
    
    /**
     * Gets the "IntervalOrder" element
     */
    public float getIntervalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALORDER$32, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntervalOrder" element
     */
    public org.apache.xmlbeans.XmlFloat xgetIntervalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INTERVALORDER$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntervalOrder" element
     */
    public boolean isSetIntervalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVALORDER$32) != 0;
        }
    }
    
    /**
     * Sets the "IntervalOrder" element
     */
    public void setIntervalOrder(float intervalOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALORDER$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALORDER$32);
            }
            target.setFloatValue(intervalOrder);
        }
    }
    
    /**
     * Sets (as xml) the "IntervalOrder" element
     */
    public void xsetIntervalOrder(org.apache.xmlbeans.XmlFloat intervalOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INTERVALORDER$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(INTERVALORDER$32);
            }
            target.set(intervalOrder);
        }
    }
    
    /**
     * Unsets the "IntervalOrder" element
     */
    public void unsetIntervalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVALORDER$32, 0);
        }
    }
    
    /**
     * Gets the "WeightUnit" element
     */
    public java.lang.String getWeightUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHTUNIT$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WeightUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetWeightUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHTUNIT$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "WeightUnit" element
     */
    public boolean isSetWeightUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHTUNIT$34) != 0;
        }
    }
    
    /**
     * Sets the "WeightUnit" element
     */
    public void setWeightUnit(java.lang.String weightUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHTUNIT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHTUNIT$34);
            }
            target.setStringValue(weightUnit);
        }
    }
    
    /**
     * Sets (as xml) the "WeightUnit" element
     */
    public void xsetWeightUnit(org.apache.xmlbeans.XmlString weightUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEIGHTUNIT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEIGHTUNIT$34);
            }
            target.set(weightUnit);
        }
    }
    
    /**
     * Unsets the "WeightUnit" element
     */
    public void unsetWeightUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHTUNIT$34, 0);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public float getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$36, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Weight" element
     */
    public org.apache.xmlbeans.XmlFloat xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(WEIGHT$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "Weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$36) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(float weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHT$36);
            }
            target.setFloatValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "Weight" element
     */
    public void xsetWeight(org.apache.xmlbeans.XmlFloat weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(WEIGHT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(WEIGHT$36);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "Weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$36, 0);
        }
    }
    
    /**
     * Gets the "RefUnit" element
     */
    public java.lang.String getRefUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNIT$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetRefUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFUNIT$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "RefUnit" element
     */
    public boolean isSetRefUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUNIT$38) != 0;
        }
    }
    
    /**
     * Sets the "RefUnit" element
     */
    public void setRefUnit(java.lang.String refUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNIT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFUNIT$38);
            }
            target.setStringValue(refUnit);
        }
    }
    
    /**
     * Sets (as xml) the "RefUnit" element
     */
    public void xsetRefUnit(org.apache.xmlbeans.XmlString refUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFUNIT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFUNIT$38);
            }
            target.set(refUnit);
        }
    }
    
    /**
     * Unsets the "RefUnit" element
     */
    public void unsetRefUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUNIT$38, 0);
        }
    }
    
    /**
     * Gets the "RefAmount" element
     */
    public float getRefAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFAMOUNT$40, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefAmount" element
     */
    public org.apache.xmlbeans.XmlFloat xgetRefAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(REFAMOUNT$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "RefAmount" element
     */
    public boolean isSetRefAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFAMOUNT$40) != 0;
        }
    }
    
    /**
     * Sets the "RefAmount" element
     */
    public void setRefAmount(float refAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFAMOUNT$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFAMOUNT$40);
            }
            target.setFloatValue(refAmount);
        }
    }
    
    /**
     * Sets (as xml) the "RefAmount" element
     */
    public void xsetRefAmount(org.apache.xmlbeans.XmlFloat refAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(REFAMOUNT$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(REFAMOUNT$40);
            }
            target.set(refAmount);
        }
    }
    
    /**
     * Unsets the "RefAmount" element
     */
    public void unsetRefAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFAMOUNT$40, 0);
        }
    }
    
    /**
     * Gets the "RefContentAmount" element
     */
    public float getRefContentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFCONTENTAMOUNT$42, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefContentAmount" element
     */
    public org.apache.xmlbeans.XmlFloat xgetRefContentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(REFCONTENTAMOUNT$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "RefContentAmount" element
     */
    public boolean isSetRefContentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFCONTENTAMOUNT$42) != 0;
        }
    }
    
    /**
     * Sets the "RefContentAmount" element
     */
    public void setRefContentAmount(float refContentAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFCONTENTAMOUNT$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFCONTENTAMOUNT$42);
            }
            target.setFloatValue(refContentAmount);
        }
    }
    
    /**
     * Sets (as xml) the "RefContentAmount" element
     */
    public void xsetRefContentAmount(org.apache.xmlbeans.XmlFloat refContentAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(REFCONTENTAMOUNT$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(REFCONTENTAMOUNT$42);
            }
            target.set(refContentAmount);
        }
    }
    
    /**
     * Unsets the "RefContentAmount" element
     */
    public void unsetRefContentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFCONTENTAMOUNT$42, 0);
        }
    }
    
    /**
     * Gets the "StockLevel" element
     */
    public float getStockLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKLEVEL$44, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "StockLevel" element
     */
    public org.apache.xmlbeans.XmlFloat xgetStockLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(STOCKLEVEL$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "StockLevel" element
     */
    public boolean isSetStockLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCKLEVEL$44) != 0;
        }
    }
    
    /**
     * Sets the "StockLevel" element
     */
    public void setStockLevel(float stockLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKLEVEL$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOCKLEVEL$44);
            }
            target.setFloatValue(stockLevel);
        }
    }
    
    /**
     * Sets (as xml) the "StockLevel" element
     */
    public void xsetStockLevel(org.apache.xmlbeans.XmlFloat stockLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(STOCKLEVEL$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(STOCKLEVEL$44);
            }
            target.set(stockLevel);
        }
    }
    
    /**
     * Unsets the "StockLevel" element
     */
    public void unsetStockLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCKLEVEL$44, 0);
        }
    }
    
    /**
     * Gets the "StockLevelAlert" element
     */
    public float getStockLevelAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKLEVELALERT$46, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "StockLevelAlert" element
     */
    public org.apache.xmlbeans.XmlFloat xgetStockLevelAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(STOCKLEVELALERT$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "StockLevelAlert" element
     */
    public boolean isSetStockLevelAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCKLEVELALERT$46) != 0;
        }
    }
    
    /**
     * Sets the "StockLevelAlert" element
     */
    public void setStockLevelAlert(float stockLevelAlert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKLEVELALERT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOCKLEVELALERT$46);
            }
            target.setFloatValue(stockLevelAlert);
        }
    }
    
    /**
     * Sets (as xml) the "StockLevelAlert" element
     */
    public void xsetStockLevelAlert(org.apache.xmlbeans.XmlFloat stockLevelAlert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(STOCKLEVELALERT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(STOCKLEVELALERT$46);
            }
            target.set(stockLevelAlert);
        }
    }
    
    /**
     * Unsets the "StockLevelAlert" element
     */
    public void unsetStockLevelAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCKLEVELALERT$46, 0);
        }
    }
    
    /**
     * Gets the "Manufacturer" element
     */
    public java.lang.String getManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Manufacturer" element
     */
    public org.apache.xmlbeans.XmlString xgetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "Manufacturer" element
     */
    public boolean isSetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURER$48) != 0;
        }
    }
    
    /**
     * Sets the "Manufacturer" element
     */
    public void setManufacturer(java.lang.String manufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUFACTURER$48);
            }
            target.setStringValue(manufacturer);
        }
    }
    
    /**
     * Sets (as xml) the "Manufacturer" element
     */
    public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUFACTURER$48);
            }
            target.set(manufacturer);
        }
    }
    
    /**
     * Unsets the "Manufacturer" element
     */
    public void unsetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURER$48, 0);
        }
    }
    
    /**
     * Gets the "ManufacturerSKU" element
     */
    public java.lang.String getManufacturerSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURERSKU$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManufacturerSKU" element
     */
    public org.apache.xmlbeans.XmlString xgetManufacturerSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURERSKU$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "ManufacturerSKU" element
     */
    public boolean isSetManufacturerSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURERSKU$50) != 0;
        }
    }
    
    /**
     * Sets the "ManufacturerSKU" element
     */
    public void setManufacturerSKU(java.lang.String manufacturerSKU)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURERSKU$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUFACTURERSKU$50);
            }
            target.setStringValue(manufacturerSKU);
        }
    }
    
    /**
     * Sets (as xml) the "ManufacturerSKU" element
     */
    public void xsetManufacturerSKU(org.apache.xmlbeans.XmlString manufacturerSKU)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURERSKU$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUFACTURERSKU$50);
            }
            target.set(manufacturerSKU);
        }
    }
    
    /**
     * Unsets the "ManufacturerSKU" element
     */
    public void unsetManufacturerSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURERSKU$50, 0);
        }
    }
    
    /**
     * Gets the "DeliveryPeriod" element
     */
    public java.lang.String getDeliveryPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPERIOD$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryPeriod" element
     */
    public org.apache.xmlbeans.XmlString xgetDeliveryPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVERYPERIOD$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryPeriod" element
     */
    public boolean isSetDeliveryPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYPERIOD$52) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryPeriod" element
     */
    public void setDeliveryPeriod(java.lang.String deliveryPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPERIOD$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYPERIOD$52);
            }
            target.setStringValue(deliveryPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryPeriod" element
     */
    public void xsetDeliveryPeriod(org.apache.xmlbeans.XmlString deliveryPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVERYPERIOD$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELIVERYPERIOD$52);
            }
            target.set(deliveryPeriod);
        }
    }
    
    /**
     * Unsets the "DeliveryPeriod" element
     */
    public void unsetDeliveryPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYPERIOD$52, 0);
        }
    }
    
    /**
     * Gets the "Length" element
     */
    public float getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$54, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Length" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LENGTH$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "Length" element
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$54) != 0;
        }
    }
    
    /**
     * Sets the "Length" element
     */
    public void setLength(float length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTH$54);
            }
            target.setFloatValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "Length" element
     */
    public void xsetLength(org.apache.xmlbeans.XmlFloat length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LENGTH$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LENGTH$54);
            }
            target.set(length);
        }
    }
    
    /**
     * Unsets the "Length" element
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$54, 0);
        }
    }
    
    /**
     * Gets the "Width" element
     */
    public float getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIDTH$56, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Width" element
     */
    public org.apache.xmlbeans.XmlFloat xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(WIDTH$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "Width" element
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIDTH$56) != 0;
        }
    }
    
    /**
     * Sets the "Width" element
     */
    public void setWidth(float width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIDTH$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WIDTH$56);
            }
            target.setFloatValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "Width" element
     */
    public void xsetWidth(org.apache.xmlbeans.XmlFloat width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(WIDTH$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(WIDTH$56);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "Width" element
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIDTH$56, 0);
        }
    }
    
    /**
     * Gets the "Height" element
     */
    public float getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$58, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Height" element
     */
    public org.apache.xmlbeans.XmlFloat xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(HEIGHT$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "Height" element
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEIGHT$58) != 0;
        }
    }
    
    /**
     * Sets the "Height" element
     */
    public void setHeight(float height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEIGHT$58);
            }
            target.setFloatValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "Height" element
     */
    public void xsetHeight(org.apache.xmlbeans.XmlFloat height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(HEIGHT$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(HEIGHT$58);
            }
            target.set(height);
        }
    }
    
    /**
     * Unsets the "Height" element
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEIGHT$58, 0);
        }
    }
    
    /**
     * Gets the "WebUrl" element
     */
    public java.lang.String getWebUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURL$60, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WebUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetWebUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBURL$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "WebUrl" element
     */
    public boolean isSetWebUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBURL$60) != 0;
        }
    }
    
    /**
     * Sets the "WebUrl" element
     */
    public void setWebUrl(java.lang.String webUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURL$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBURL$60);
            }
            target.setStringValue(webUrl);
        }
    }
    
    /**
     * Sets (as xml) the "WebUrl" element
     */
    public void xsetWebUrl(org.apache.xmlbeans.XmlString webUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBURL$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBURL$60);
            }
            target.set(webUrl);
        }
    }
    
    /**
     * Unsets the "WebUrl" element
     */
    public void unsetWebUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBURL$60, 0);
        }
    }
    
    /**
     * Gets the "IsAvailable" element
     */
    public boolean getIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLE$62, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAvailable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLE$62, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsAvailable" element
     */
    public void setIsAvailable(boolean isAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLE$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISAVAILABLE$62);
            }
            target.setBooleanValue(isAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "IsAvailable" element
     */
    public void xsetIsAvailable(org.apache.xmlbeans.XmlBoolean isAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLE$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAVAILABLE$62);
            }
            target.set(isAvailable);
        }
    }
    
    /**
     * Gets the "AvailabilityComment" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getAvailabilityComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(AVAILABILITYCOMMENT$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AvailabilityComment" element
     */
    public boolean isSetAvailabilityComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITYCOMMENT$64) != 0;
        }
    }
    
    /**
     * Sets the "AvailabilityComment" element
     */
    public void setAvailabilityComment(de.epages.ws.common.model.ListOfLocalizedValues availabilityComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(AVAILABILITYCOMMENT$64, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(AVAILABILITYCOMMENT$64);
            }
            target.set(availabilityComment);
        }
    }
    
    /**
     * Appends and returns a new empty "AvailabilityComment" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewAvailabilityComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(AVAILABILITYCOMMENT$64);
            return target;
        }
    }
    
    /**
     * Unsets the "AvailabilityComment" element
     */
    public void unsetAvailabilityComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITYCOMMENT$64, 0);
        }
    }
    
    /**
     * Gets the "AvailabilityDate" element
     */
    public java.util.Calendar getAvailabilityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITYDATE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailabilityDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAvailabilityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AVAILABILITYDATE$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "AvailabilityDate" element
     */
    public boolean isSetAvailabilityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITYDATE$66) != 0;
        }
    }
    
    /**
     * Sets the "AvailabilityDate" element
     */
    public void setAvailabilityDate(java.util.Calendar availabilityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITYDATE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABILITYDATE$66);
            }
            target.setCalendarValue(availabilityDate);
        }
    }
    
    /**
     * Sets (as xml) the "AvailabilityDate" element
     */
    public void xsetAvailabilityDate(org.apache.xmlbeans.XmlDateTime availabilityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AVAILABILITYDATE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(AVAILABILITYDATE$66);
            }
            target.set(availabilityDate);
        }
    }
    
    /**
     * Unsets the "AvailabilityDate" element
     */
    public void unsetAvailabilityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITYDATE$66, 0);
        }
    }
    
    /**
     * Gets the "URI" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(URI$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "URI" element
     */
    public boolean isSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URI$68) != 0;
        }
    }
    
    /**
     * Sets the "URI" element
     */
    public void setURI(de.epages.ws.common.model.ListOfLocalizedValues uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(URI$68, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(URI$68);
            }
            target.set(uri);
        }
    }
    
    /**
     * Appends and returns a new empty "URI" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(URI$68);
            return target;
        }
    }
    
    /**
     * Unsets the "URI" element
     */
    public void unsetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URI$68, 0);
        }
    }
    
    /**
     * Gets the "CanonicalURL" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues getCanonicalURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(CANONICALURL$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CanonicalURL" element
     */
    public boolean isSetCanonicalURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANONICALURL$70) != 0;
        }
    }
    
    /**
     * Sets the "CanonicalURL" element
     */
    public void setCanonicalURL(de.epages.ws.common.model.ListOfLocalizedValues canonicalURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().find_element_user(CANONICALURL$70, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(CANONICALURL$70);
            }
            target.set(canonicalURL);
        }
    }
    
    /**
     * Appends and returns a new empty "CanonicalURL" element
     */
    public de.epages.ws.common.model.ListOfLocalizedValues addNewCanonicalURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfLocalizedValues target = null;
            target = (de.epages.ws.common.model.ListOfLocalizedValues)get_store().add_element_user(CANONICALURL$70);
            return target;
        }
    }
    
    /**
     * Unsets the "CanonicalURL" element
     */
    public void unsetCanonicalURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANONICALURL$70, 0);
        }
    }
    
    /**
     * Gets the "IsDownloadProduct" element
     */
    public boolean getIsDownloadProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOWNLOADPRODUCT$72, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDownloadProduct" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDownloadProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOWNLOADPRODUCT$72, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsDownloadProduct" element
     */
    public void setIsDownloadProduct(boolean isDownloadProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOWNLOADPRODUCT$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDOWNLOADPRODUCT$72);
            }
            target.setBooleanValue(isDownloadProduct);
        }
    }
    
    /**
     * Sets (as xml) the "IsDownloadProduct" element
     */
    public void xsetIsDownloadProduct(org.apache.xmlbeans.XmlBoolean isDownloadProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOWNLOADPRODUCT$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDOWNLOADPRODUCT$72);
            }
            target.set(isDownloadProduct);
        }
    }
    
    /**
     * Gets the "MaxDownloadTime" element
     */
    public java.math.BigInteger getMaxDownloadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOWNLOADTIME$74, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxDownloadTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxDownloadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDOWNLOADTIME$74, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxDownloadTime" element
     */
    public boolean isSetMaxDownloadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDOWNLOADTIME$74) != 0;
        }
    }
    
    /**
     * Sets the "MaxDownloadTime" element
     */
    public void setMaxDownloadTime(java.math.BigInteger maxDownloadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOWNLOADTIME$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDOWNLOADTIME$74);
            }
            target.setBigIntegerValue(maxDownloadTime);
        }
    }
    
    /**
     * Sets (as xml) the "MaxDownloadTime" element
     */
    public void xsetMaxDownloadTime(org.apache.xmlbeans.XmlInteger maxDownloadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDOWNLOADTIME$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXDOWNLOADTIME$74);
            }
            target.set(maxDownloadTime);
        }
    }
    
    /**
     * Unsets the "MaxDownloadTime" element
     */
    public void unsetMaxDownloadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDOWNLOADTIME$74, 0);
        }
    }
    
    /**
     * Gets the "MaxDownloadCount" element
     */
    public java.math.BigInteger getMaxDownloadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOWNLOADCOUNT$76, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxDownloadCount" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxDownloadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDOWNLOADCOUNT$76, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxDownloadCount" element
     */
    public boolean isSetMaxDownloadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDOWNLOADCOUNT$76) != 0;
        }
    }
    
    /**
     * Sets the "MaxDownloadCount" element
     */
    public void setMaxDownloadCount(java.math.BigInteger maxDownloadCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOWNLOADCOUNT$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDOWNLOADCOUNT$76);
            }
            target.setBigIntegerValue(maxDownloadCount);
        }
    }
    
    /**
     * Sets (as xml) the "MaxDownloadCount" element
     */
    public void xsetMaxDownloadCount(org.apache.xmlbeans.XmlInteger maxDownloadCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDOWNLOADCOUNT$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXDOWNLOADCOUNT$76);
            }
            target.set(maxDownloadCount);
        }
    }
    
    /**
     * Unsets the "MaxDownloadCount" element
     */
    public void unsetMaxDownloadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDOWNLOADCOUNT$76, 0);
        }
    }
    
    /**
     * Gets the "DownloadProductMaps" element
     */
    public de.epages.ws.product11.model.ListOfDownloads getDownloadProductMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfDownloads target = null;
            target = (de.epages.ws.product11.model.ListOfDownloads)get_store().find_element_user(DOWNLOADPRODUCTMAPS$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DownloadProductMaps" element
     */
    public boolean isSetDownloadProductMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOWNLOADPRODUCTMAPS$78) != 0;
        }
    }
    
    /**
     * Sets the "DownloadProductMaps" element
     */
    public void setDownloadProductMaps(de.epages.ws.product11.model.ListOfDownloads downloadProductMaps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfDownloads target = null;
            target = (de.epages.ws.product11.model.ListOfDownloads)get_store().find_element_user(DOWNLOADPRODUCTMAPS$78, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfDownloads)get_store().add_element_user(DOWNLOADPRODUCTMAPS$78);
            }
            target.set(downloadProductMaps);
        }
    }
    
    /**
     * Appends and returns a new empty "DownloadProductMaps" element
     */
    public de.epages.ws.product11.model.ListOfDownloads addNewDownloadProductMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfDownloads target = null;
            target = (de.epages.ws.product11.model.ListOfDownloads)get_store().add_element_user(DOWNLOADPRODUCTMAPS$78);
            return target;
        }
    }
    
    /**
     * Unsets the "DownloadProductMaps" element
     */
    public void unsetDownloadProductMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOWNLOADPRODUCTMAPS$78, 0);
        }
    }
    
    /**
     * Gets the "SuperProduct" element
     */
    public java.lang.String getSuperProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPERPRODUCT$80, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuperProduct" element
     */
    public org.apache.xmlbeans.XmlString xgetSuperProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPERPRODUCT$80, 0);
            return target;
        }
    }
    
    /**
     * True if has "SuperProduct" element
     */
    public boolean isSetSuperProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPERPRODUCT$80) != 0;
        }
    }
    
    /**
     * Sets the "SuperProduct" element
     */
    public void setSuperProduct(java.lang.String superProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPERPRODUCT$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPERPRODUCT$80);
            }
            target.setStringValue(superProduct);
        }
    }
    
    /**
     * Sets (as xml) the "SuperProduct" element
     */
    public void xsetSuperProduct(org.apache.xmlbeans.XmlString superProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPERPRODUCT$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPERPRODUCT$80);
            }
            target.set(superProduct);
        }
    }
    
    /**
     * Unsets the "SuperProduct" element
     */
    public void unsetSuperProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPERPRODUCT$80, 0);
        }
    }
    
    /**
     * Gets the "SubProducts" element
     */
    public de.epages.ws.product11.model.ListOfSubProducts getSubProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfSubProducts target = null;
            target = (de.epages.ws.product11.model.ListOfSubProducts)get_store().find_element_user(SUBPRODUCTS$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubProducts" element
     */
    public boolean isSetSubProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBPRODUCTS$82) != 0;
        }
    }
    
    /**
     * Sets the "SubProducts" element
     */
    public void setSubProducts(de.epages.ws.product11.model.ListOfSubProducts subProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfSubProducts target = null;
            target = (de.epages.ws.product11.model.ListOfSubProducts)get_store().find_element_user(SUBPRODUCTS$82, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfSubProducts)get_store().add_element_user(SUBPRODUCTS$82);
            }
            target.set(subProducts);
        }
    }
    
    /**
     * Appends and returns a new empty "SubProducts" element
     */
    public de.epages.ws.product11.model.ListOfSubProducts addNewSubProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfSubProducts target = null;
            target = (de.epages.ws.product11.model.ListOfSubProducts)get_store().add_element_user(SUBPRODUCTS$82);
            return target;
        }
    }
    
    /**
     * Unsets the "SubProducts" element
     */
    public void unsetSubProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBPRODUCTS$82, 0);
        }
    }
    
    /**
     * Gets the "DefaultSubProduct" element
     */
    public java.lang.String getDefaultSubProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSUBPRODUCT$84, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultSubProduct" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultSubProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSUBPRODUCT$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultSubProduct" element
     */
    public boolean isSetDefaultSubProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSUBPRODUCT$84) != 0;
        }
    }
    
    /**
     * Sets the "DefaultSubProduct" element
     */
    public void setDefaultSubProduct(java.lang.String defaultSubProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSUBPRODUCT$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTSUBPRODUCT$84);
            }
            target.setStringValue(defaultSubProduct);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultSubProduct" element
     */
    public void xsetDefaultSubProduct(org.apache.xmlbeans.XmlString defaultSubProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSUBPRODUCT$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTSUBPRODUCT$84);
            }
            target.set(defaultSubProduct);
        }
    }
    
    /**
     * Unsets the "DefaultSubProduct" element
     */
    public void unsetDefaultSubProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSUBPRODUCT$84, 0);
        }
    }
    
    /**
     * Gets the "IsDefault" element
     */
    public boolean getIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULT$86, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDefault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULT$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDefault" element
     */
    public boolean isSetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDEFAULT$86) != 0;
        }
    }
    
    /**
     * Sets the "IsDefault" element
     */
    public void setIsDefault(boolean isDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULT$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDEFAULT$86);
            }
            target.setBooleanValue(isDefault);
        }
    }
    
    /**
     * Sets (as xml) the "IsDefault" element
     */
    public void xsetIsDefault(org.apache.xmlbeans.XmlBoolean isDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULT$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDEFAULT$86);
            }
            target.set(isDefault);
        }
    }
    
    /**
     * Unsets the "IsDefault" element
     */
    public void unsetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDEFAULT$86, 0);
        }
    }
    
    /**
     * Gets the "HasSubOwnPrices" element
     */
    public boolean getHasSubOwnPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBOWNPRICES$88, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasSubOwnPrices" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasSubOwnPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBOWNPRICES$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "HasSubOwnPrices" element
     */
    public boolean isSetHasSubOwnPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASSUBOWNPRICES$88) != 0;
        }
    }
    
    /**
     * Sets the "HasSubOwnPrices" element
     */
    public void setHasSubOwnPrices(boolean hasSubOwnPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBOWNPRICES$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASSUBOWNPRICES$88);
            }
            target.setBooleanValue(hasSubOwnPrices);
        }
    }
    
    /**
     * Sets (as xml) the "HasSubOwnPrices" element
     */
    public void xsetHasSubOwnPrices(org.apache.xmlbeans.XmlBoolean hasSubOwnPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBOWNPRICES$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASSUBOWNPRICES$88);
            }
            target.set(hasSubOwnPrices);
        }
    }
    
    /**
     * Unsets the "HasSubOwnPrices" element
     */
    public void unsetHasSubOwnPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASSUBOWNPRICES$88, 0);
        }
    }
    
    /**
     * Gets the "VariationAttributes" element
     */
    public de.epages.ws.common.model.ListOfAttributes getVariationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().find_element_user(VARIATIONATTRIBUTES$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VariationAttributes" element
     */
    public boolean isSetVariationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIATIONATTRIBUTES$90) != 0;
        }
    }
    
    /**
     * Sets the "VariationAttributes" element
     */
    public void setVariationAttributes(de.epages.ws.common.model.ListOfAttributes variationAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().find_element_user(VARIATIONATTRIBUTES$90, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfAttributes)get_store().add_element_user(VARIATIONATTRIBUTES$90);
            }
            target.set(variationAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "VariationAttributes" element
     */
    public de.epages.ws.common.model.ListOfAttributes addNewVariationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().add_element_user(VARIATIONATTRIBUTES$90);
            return target;
        }
    }
    
    /**
     * Unsets the "VariationAttributes" element
     */
    public void unsetVariationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIATIONATTRIBUTES$90, 0);
        }
    }
    
    /**
     * Gets the "ProductPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices getProductPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(PRODUCTPRICES$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductPrices" element
     */
    public boolean isSetProductPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTPRICES$92) != 0;
        }
    }
    
    /**
     * Sets the "ProductPrices" element
     */
    public void setProductPrices(de.epages.ws.product11.model.ListOfProductPrices productPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(PRODUCTPRICES$92, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(PRODUCTPRICES$92);
            }
            target.set(productPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices addNewProductPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(PRODUCTPRICES$92);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductPrices" element
     */
    public void unsetProductPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTPRICES$92, 0);
        }
    }
    
    /**
     * Gets the "ManufacturerPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices getManufacturerPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(MANUFACTURERPRICES$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ManufacturerPrices" element
     */
    public boolean isSetManufacturerPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURERPRICES$94) != 0;
        }
    }
    
    /**
     * Sets the "ManufacturerPrices" element
     */
    public void setManufacturerPrices(de.epages.ws.product11.model.ListOfProductPrices manufacturerPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(MANUFACTURERPRICES$94, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(MANUFACTURERPRICES$94);
            }
            target.set(manufacturerPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "ManufacturerPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices addNewManufacturerPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(MANUFACTURERPRICES$94);
            return target;
        }
    }
    
    /**
     * Unsets the "ManufacturerPrices" element
     */
    public void unsetManufacturerPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURERPRICES$94, 0);
        }
    }
    
    /**
     * Gets the "DepositPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices getDepositPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(DEPOSITPRICES$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DepositPrices" element
     */
    public boolean isSetDepositPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSITPRICES$96) != 0;
        }
    }
    
    /**
     * Sets the "DepositPrices" element
     */
    public void setDepositPrices(de.epages.ws.product11.model.ListOfProductPrices depositPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(DEPOSITPRICES$96, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(DEPOSITPRICES$96);
            }
            target.set(depositPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "DepositPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices addNewDepositPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(DEPOSITPRICES$96);
            return target;
        }
    }
    
    /**
     * Unsets the "DepositPrices" element
     */
    public void unsetDepositPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSITPRICES$96, 0);
        }
    }
    
    /**
     * Gets the "EcoParticipationPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices getEcoParticipationPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(ECOPARTICIPATIONPRICES$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EcoParticipationPrices" element
     */
    public boolean isSetEcoParticipationPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ECOPARTICIPATIONPRICES$98) != 0;
        }
    }
    
    /**
     * Sets the "EcoParticipationPrices" element
     */
    public void setEcoParticipationPrices(de.epages.ws.product11.model.ListOfProductPrices ecoParticipationPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(ECOPARTICIPATIONPRICES$98, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(ECOPARTICIPATIONPRICES$98);
            }
            target.set(ecoParticipationPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "EcoParticipationPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices addNewEcoParticipationPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(ECOPARTICIPATIONPRICES$98);
            return target;
        }
    }
    
    /**
     * Unsets the "EcoParticipationPrices" element
     */
    public void unsetEcoParticipationPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ECOPARTICIPATIONPRICES$98, 0);
        }
    }
    
    /**
     * Gets the "PrepaymentPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices getPrepaymentPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(PREPAYMENTPRICES$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrepaymentPrices" element
     */
    public boolean isSetPrepaymentPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREPAYMENTPRICES$100) != 0;
        }
    }
    
    /**
     * Sets the "PrepaymentPrices" element
     */
    public void setPrepaymentPrices(de.epages.ws.product11.model.ListOfProductPrices prepaymentPrices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().find_element_user(PREPAYMENTPRICES$100, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(PREPAYMENTPRICES$100);
            }
            target.set(prepaymentPrices);
        }
    }
    
    /**
     * Appends and returns a new empty "PrepaymentPrices" element
     */
    public de.epages.ws.product11.model.ListOfProductPrices addNewPrepaymentPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfProductPrices target = null;
            target = (de.epages.ws.product11.model.ListOfProductPrices)get_store().add_element_user(PREPAYMENTPRICES$100);
            return target;
        }
    }
    
    /**
     * Unsets the "PrepaymentPrices" element
     */
    public void unsetPrepaymentPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREPAYMENTPRICES$100, 0);
        }
    }
    
    /**
     * Gets the "PrepaymentType" element
     */
    public java.lang.String getPrepaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAYMENTTYPE$102, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrepaymentType" element
     */
    public org.apache.xmlbeans.XmlString xgetPrepaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAYMENTTYPE$102, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrepaymentType" element
     */
    public boolean isSetPrepaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREPAYMENTTYPE$102) != 0;
        }
    }
    
    /**
     * Sets the "PrepaymentType" element
     */
    public void setPrepaymentType(java.lang.String prepaymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAYMENTTYPE$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAYMENTTYPE$102);
            }
            target.setStringValue(prepaymentType);
        }
    }
    
    /**
     * Sets (as xml) the "PrepaymentType" element
     */
    public void xsetPrepaymentType(org.apache.xmlbeans.XmlString prepaymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAYMENTTYPE$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAYMENTTYPE$102);
            }
            target.set(prepaymentType);
        }
    }
    
    /**
     * Unsets the "PrepaymentType" element
     */
    public void unsetPrepaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREPAYMENTTYPE$102, 0);
        }
    }
    
    /**
     * Gets the "PrepaymentValue" element
     */
    public float getPrepaymentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAYMENTVALUE$104, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrepaymentValue" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPrepaymentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PREPAYMENTVALUE$104, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrepaymentValue" element
     */
    public boolean isSetPrepaymentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREPAYMENTVALUE$104) != 0;
        }
    }
    
    /**
     * Sets the "PrepaymentValue" element
     */
    public void setPrepaymentValue(float prepaymentValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAYMENTVALUE$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAYMENTVALUE$104);
            }
            target.setFloatValue(prepaymentValue);
        }
    }
    
    /**
     * Sets (as xml) the "PrepaymentValue" element
     */
    public void xsetPrepaymentValue(org.apache.xmlbeans.XmlFloat prepaymentValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PREPAYMENTVALUE$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PREPAYMENTVALUE$104);
            }
            target.set(prepaymentValue);
        }
    }
    
    /**
     * Unsets the "PrepaymentValue" element
     */
    public void unsetPrepaymentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREPAYMENTVALUE$104, 0);
        }
    }
    
    /**
     * Gets the "ShippingMethods" element
     */
    public de.epages.ws.product11.model.ListOfShippingMethods getShippingMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfShippingMethods target = null;
            target = (de.epages.ws.product11.model.ListOfShippingMethods)get_store().find_element_user(SHIPPINGMETHODS$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ShippingMethods" element
     */
    public boolean isSetShippingMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGMETHODS$106) != 0;
        }
    }
    
    /**
     * Sets the "ShippingMethods" element
     */
    public void setShippingMethods(de.epages.ws.product11.model.ListOfShippingMethods shippingMethods)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfShippingMethods target = null;
            target = (de.epages.ws.product11.model.ListOfShippingMethods)get_store().find_element_user(SHIPPINGMETHODS$106, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.model.ListOfShippingMethods)get_store().add_element_user(SHIPPINGMETHODS$106);
            }
            target.set(shippingMethods);
        }
    }
    
    /**
     * Appends and returns a new empty "ShippingMethods" element
     */
    public de.epages.ws.product11.model.ListOfShippingMethods addNewShippingMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.model.ListOfShippingMethods target = null;
            target = (de.epages.ws.product11.model.ListOfShippingMethods)get_store().add_element_user(SHIPPINGMETHODS$106);
            return target;
        }
    }
    
    /**
     * Unsets the "ShippingMethods" element
     */
    public void unsetShippingMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGMETHODS$106, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public de.epages.ws.common.model.ListOfAttributes getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().find_element_user(ATTRIBUTES$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$108) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(de.epages.ws.common.model.ListOfAttributes attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().find_element_user(ATTRIBUTES$108, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.ListOfAttributes)get_store().add_element_user(ATTRIBUTES$108);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public de.epages.ws.common.model.ListOfAttributes addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.ListOfAttributes target = null;
            target = (de.epages.ws.common.model.ListOfAttributes)get_store().add_element_user(ATTRIBUTES$108);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$108, 0);
        }
    }
    
    /**
     * Gets the "Error" element
     */
    public de.epages.ws.common.model.TError getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Error" element
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$110) != 0;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(de.epages.ws.common.model.TError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$110, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$110);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public de.epages.ws.common.model.TError addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$110);
            return target;
        }
    }
    
    /**
     * Unsets the "Error" element
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$110, 0);
        }
    }
}
