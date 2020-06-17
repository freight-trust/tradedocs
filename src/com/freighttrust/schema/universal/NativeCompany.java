
package com.freighttrust.schema.universal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NativeCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NativeCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BusinessRegNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BusinessRegNo2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomsRegistrationNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="City" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Phone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="State" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WebAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoOfAccountingPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PeriodFormat" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StartDate" type="{http://www.freighttrust.com/Schemas/Native/2011/11}emptiableDateTime" minOccurs="0"/&gt;
 *         &lt;element name="PeriodEndWeekDay" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLCurrentPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ARAPCurrentPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GLClosedPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ARAPClosedPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExRateDisplayMode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExRateDecimals" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="LocalDocLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsGSTRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsGSTCashBasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWHTRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWHTCashBasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReciprocal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Email" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressMap" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrgProxy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalCurrency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GlbBranchCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GlbBranch" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Code" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BranchName" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Address1" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Address2" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="City" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="25"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="State" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="25"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PostCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Phone" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Fax" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InternalExtension" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="WebAddress" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LocalDocLanguage" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="Email" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="254"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AccountingGroupCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddressMap" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="HomePort" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="Code" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OrgProxy" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="Code" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddressProxy" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="Code" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="25"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="OrgHeader" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="Code" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="12"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/all&gt;
 *                                               &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CountryCode" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="Code" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AccCFXUpliftConfigurationViewCollection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="ConfigType" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Ledger" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="JobType" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ServiceDirection" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="TransportMode" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="GlbCompany" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;all&gt;
 *                                                           &lt;element name="Code" minOccurs="0"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;maxLength value="3"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/all&gt;
 *                                                         &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Currency" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;all&gt;
 *                                                           &lt;element name="Code" minOccurs="0"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;maxLength value="3"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/all&gt;
 *                                                         &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                                         &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/all&gt;
 *                                               &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccCFXUpliftConfigurationViewCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ConfigType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Ledger" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="JobType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ServiceDirection" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TransportMode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Currency" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="Code" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccExchangeRateConfigurationViewCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccExchangeRateConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ConfigType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Ledger" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="JobType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ServiceDirection" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TransportMode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ExRateType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Preference" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeCompany", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", propOrder = {

})
public class NativeCompany {

    @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String pk;
    @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String code;
    @XmlElement(name = "Name", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String name;
    @XmlElement(name = "BusinessRegNo", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String businessRegNo;
    @XmlElement(name = "BusinessRegNo2", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String businessRegNo2;
    @XmlElement(name = "CustomsRegistrationNo", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String customsRegistrationNo;
    @XmlElement(name = "Address1", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String address1;
    @XmlElement(name = "Address2", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String address2;
    @XmlElement(name = "City", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String city;
    @XmlElement(name = "Phone", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String phone;
    @XmlElement(name = "PostCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String postCode;
    @XmlElement(name = "State", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String state;
    @XmlElement(name = "Fax", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String fax;
    @XmlElement(name = "WebAddress", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String webAddress;
    @XmlElement(name = "NoOfAccountingPeriods", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer noOfAccountingPeriods;
    @XmlElement(name = "PeriodFormat", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String periodFormat;
    @XmlElement(name = "StartDate", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String startDate;
    @XmlElement(name = "PeriodEndWeekDay", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String periodEndWeekDay;
    @XmlElement(name = "GLCurrentPeriod", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer glCurrentPeriod;
    @XmlElement(name = "ARAPCurrentPeriod", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer arapCurrentPeriod;
    @XmlElement(name = "GLClosedPeriod", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer glClosedPeriod;
    @XmlElement(name = "ARAPClosedPeriod", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer arapClosedPeriod;
    @XmlElement(name = "ExRateDisplayMode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String exRateDisplayMode;
    @XmlElement(name = "ExRateDecimals", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Short exRateDecimals;
    @XmlElement(name = "LocalDocLanguage", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String localDocLanguage;
    @XmlElement(name = "IsGSTRegistered", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isGSTRegistered;
    @XmlElement(name = "IsGSTCashBasis", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isGSTCashBasis;
    @XmlElement(name = "IsWHTRegistered", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isWHTRegistered;
    @XmlElement(name = "IsWHTCashBasis", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isWHTCashBasis;
    @XmlElement(name = "IsReciprocal", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isReciprocal;
    @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isActive;
    @XmlElement(name = "Email", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String email;
    @XmlElement(name = "AddressMap", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String addressMap;
    @XmlElement(name = "OrgProxy", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.OrgProxy orgProxy;
    @XmlElement(name = "LocalCurrency", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.LocalCurrency localCurrency;
    @XmlElement(name = "CountryCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.CountryCode countryCode;
    @XmlElement(name = "GlbBranchCollection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.GlbBranchCollection glbBranchCollection;
    @XmlElement(name = "AccCFXUpliftConfigurationViewCollection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.AccCFXUpliftConfigurationViewCollection accCFXUpliftConfigurationViewCollection;
    @XmlElement(name = "AccExchangeRateConfigurationViewCollection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeCompany.AccExchangeRateConfigurationViewCollection accExchangeRateConfigurationViewCollection;
    @XmlAttribute(name = "Action")
    protected Action action;

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPK() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPK(String value) {
        this.pk = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the businessRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRegNo() {
        return businessRegNo;
    }

    /**
     * Sets the value of the businessRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRegNo(String value) {
        this.businessRegNo = value;
    }

    /**
     * Gets the value of the businessRegNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRegNo2() {
        return businessRegNo2;
    }

    /**
     * Sets the value of the businessRegNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRegNo2(String value) {
        this.businessRegNo2 = value;
    }

    /**
     * Gets the value of the customsRegistrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsRegistrationNo() {
        return customsRegistrationNo;
    }

    /**
     * Sets the value of the customsRegistrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsRegistrationNo(String value) {
        this.customsRegistrationNo = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Gets the value of the noOfAccountingPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfAccountingPeriods() {
        return noOfAccountingPeriods;
    }

    /**
     * Sets the value of the noOfAccountingPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfAccountingPeriods(Integer value) {
        this.noOfAccountingPeriods = value;
    }

    /**
     * Gets the value of the periodFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodFormat() {
        return periodFormat;
    }

    /**
     * Sets the value of the periodFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodFormat(String value) {
        this.periodFormat = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the periodEndWeekDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodEndWeekDay() {
        return periodEndWeekDay;
    }

    /**
     * Sets the value of the periodEndWeekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodEndWeekDay(String value) {
        this.periodEndWeekDay = value;
    }

    /**
     * Gets the value of the glCurrentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGLCurrentPeriod() {
        return glCurrentPeriod;
    }

    /**
     * Sets the value of the glCurrentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGLCurrentPeriod(Integer value) {
        this.glCurrentPeriod = value;
    }

    /**
     * Gets the value of the arapCurrentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getARAPCurrentPeriod() {
        return arapCurrentPeriod;
    }

    /**
     * Sets the value of the arapCurrentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setARAPCurrentPeriod(Integer value) {
        this.arapCurrentPeriod = value;
    }

    /**
     * Gets the value of the glClosedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGLClosedPeriod() {
        return glClosedPeriod;
    }

    /**
     * Sets the value of the glClosedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGLClosedPeriod(Integer value) {
        this.glClosedPeriod = value;
    }

    /**
     * Gets the value of the arapClosedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getARAPClosedPeriod() {
        return arapClosedPeriod;
    }

    /**
     * Sets the value of the arapClosedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setARAPClosedPeriod(Integer value) {
        this.arapClosedPeriod = value;
    }

    /**
     * Gets the value of the exRateDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExRateDisplayMode() {
        return exRateDisplayMode;
    }

    /**
     * Sets the value of the exRateDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExRateDisplayMode(String value) {
        this.exRateDisplayMode = value;
    }

    /**
     * Gets the value of the exRateDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getExRateDecimals() {
        return exRateDecimals;
    }

    /**
     * Sets the value of the exRateDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExRateDecimals(Short value) {
        this.exRateDecimals = value;
    }

    /**
     * Gets the value of the localDocLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDocLanguage() {
        return localDocLanguage;
    }

    /**
     * Sets the value of the localDocLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDocLanguage(String value) {
        this.localDocLanguage = value;
    }

    /**
     * Gets the value of the isGSTRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGSTRegistered() {
        return isGSTRegistered;
    }

    /**
     * Sets the value of the isGSTRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGSTRegistered(Boolean value) {
        this.isGSTRegistered = value;
    }

    /**
     * Gets the value of the isGSTCashBasis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGSTCashBasis() {
        return isGSTCashBasis;
    }

    /**
     * Sets the value of the isGSTCashBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGSTCashBasis(Boolean value) {
        this.isGSTCashBasis = value;
    }

    /**
     * Gets the value of the isWHTRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWHTRegistered() {
        return isWHTRegistered;
    }

    /**
     * Sets the value of the isWHTRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWHTRegistered(Boolean value) {
        this.isWHTRegistered = value;
    }

    /**
     * Gets the value of the isWHTCashBasis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWHTCashBasis() {
        return isWHTCashBasis;
    }

    /**
     * Sets the value of the isWHTCashBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWHTCashBasis(Boolean value) {
        this.isWHTCashBasis = value;
    }

    /**
     * Gets the value of the isReciprocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReciprocal() {
        return isReciprocal;
    }

    /**
     * Sets the value of the isReciprocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReciprocal(Boolean value) {
        this.isReciprocal = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the addressMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressMap() {
        return addressMap;
    }

    /**
     * Sets the value of the addressMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressMap(String value) {
        this.addressMap = value;
    }

    /**
     * Gets the value of the orgProxy property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.OrgProxy }
     *     
     */
    public NativeCompany.OrgProxy getOrgProxy() {
        return orgProxy;
    }

    /**
     * Sets the value of the orgProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.OrgProxy }
     *     
     */
    public void setOrgProxy(NativeCompany.OrgProxy value) {
        this.orgProxy = value;
    }

    /**
     * Gets the value of the localCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.LocalCurrency }
     *     
     */
    public NativeCompany.LocalCurrency getLocalCurrency() {
        return localCurrency;
    }

    /**
     * Sets the value of the localCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.LocalCurrency }
     *     
     */
    public void setLocalCurrency(NativeCompany.LocalCurrency value) {
        this.localCurrency = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.CountryCode }
     *     
     */
    public NativeCompany.CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.CountryCode }
     *     
     */
    public void setCountryCode(NativeCompany.CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the glbBranchCollection property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.GlbBranchCollection }
     *     
     */
    public NativeCompany.GlbBranchCollection getGlbBranchCollection() {
        return glbBranchCollection;
    }

    /**
     * Sets the value of the glbBranchCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.GlbBranchCollection }
     *     
     */
    public void setGlbBranchCollection(NativeCompany.GlbBranchCollection value) {
        this.glbBranchCollection = value;
    }

    /**
     * Gets the value of the accCFXUpliftConfigurationViewCollection property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.AccCFXUpliftConfigurationViewCollection }
     *     
     */
    public NativeCompany.AccCFXUpliftConfigurationViewCollection getAccCFXUpliftConfigurationViewCollection() {
        return accCFXUpliftConfigurationViewCollection;
    }

    /**
     * Sets the value of the accCFXUpliftConfigurationViewCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.AccCFXUpliftConfigurationViewCollection }
     *     
     */
    public void setAccCFXUpliftConfigurationViewCollection(NativeCompany.AccCFXUpliftConfigurationViewCollection value) {
        this.accCFXUpliftConfigurationViewCollection = value;
    }

    /**
     * Gets the value of the accExchangeRateConfigurationViewCollection property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany.AccExchangeRateConfigurationViewCollection }
     *     
     */
    public NativeCompany.AccExchangeRateConfigurationViewCollection getAccExchangeRateConfigurationViewCollection() {
        return accExchangeRateConfigurationViewCollection;
    }

    /**
     * Sets the value of the accExchangeRateConfigurationViewCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany.AccExchangeRateConfigurationViewCollection }
     *     
     */
    public void setAccExchangeRateConfigurationViewCollection(NativeCompany.AccExchangeRateConfigurationViewCollection value) {
        this.accExchangeRateConfigurationViewCollection = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ConfigType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Ledger" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="JobType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ServiceDirection" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TransportMode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Currency" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="Code" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accCFXUpliftConfigurationView"
    })
    public static class AccCFXUpliftConfigurationViewCollection {

        @XmlElement(name = "AccCFXUpliftConfigurationView", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected List<NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView> accCFXUpliftConfigurationView;

        /**
         * Gets the value of the accCFXUpliftConfigurationView property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accCFXUpliftConfigurationView property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccCFXUpliftConfigurationView().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView }
         * 
         * 
         */
        public List<NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView> getAccCFXUpliftConfigurationView() {
            if (accCFXUpliftConfigurationView == null) {
                accCFXUpliftConfigurationView = new ArrayList<NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView>();
            }
            return this.accCFXUpliftConfigurationView;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ConfigType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Ledger" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="JobType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ServiceDirection" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TransportMode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Currency" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="Code" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class AccCFXUpliftConfigurationView {

            @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String pk;
            @XmlElement(name = "ConfigType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String configType;
            @XmlElement(name = "Ledger", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String ledger;
            @XmlElement(name = "JobType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String jobType;
            @XmlElement(name = "ServiceDirection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String serviceDirection;
            @XmlElement(name = "TransportMode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String transportMode;
            @XmlElement(name = "CFXPercentage", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected BigDecimal cfxPercentage;
            @XmlElement(name = "CFXMinimum", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected BigDecimal cfxMinimum;
            @XmlElement(name = "Currency", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency currency;
            @XmlAttribute(name = "Action")
            protected Action action;

            /**
             * Gets the value of the pk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPK() {
                return pk;
            }

            /**
             * Sets the value of the pk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPK(String value) {
                this.pk = value;
            }

            /**
             * Gets the value of the configType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfigType() {
                return configType;
            }

            /**
             * Sets the value of the configType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfigType(String value) {
                this.configType = value;
            }

            /**
             * Gets the value of the ledger property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLedger() {
                return ledger;
            }

            /**
             * Sets the value of the ledger property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLedger(String value) {
                this.ledger = value;
            }

            /**
             * Gets the value of the jobType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJobType() {
                return jobType;
            }

            /**
             * Sets the value of the jobType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJobType(String value) {
                this.jobType = value;
            }

            /**
             * Gets the value of the serviceDirection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceDirection() {
                return serviceDirection;
            }

            /**
             * Sets the value of the serviceDirection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceDirection(String value) {
                this.serviceDirection = value;
            }

            /**
             * Gets the value of the transportMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportMode() {
                return transportMode;
            }

            /**
             * Sets the value of the transportMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransportMode(String value) {
                this.transportMode = value;
            }

            /**
             * Gets the value of the cfxPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCFXPercentage() {
                return cfxPercentage;
            }

            /**
             * Sets the value of the cfxPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCFXPercentage(BigDecimal value) {
                this.cfxPercentage = value;
            }

            /**
             * Gets the value of the cfxMinimum property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCFXMinimum() {
                return cfxMinimum;
            }

            /**
             * Sets the value of the cfxMinimum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCFXMinimum(BigDecimal value) {
                this.cfxMinimum = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency }
             *     
             */
            public NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency }
             *     
             */
            public void setCurrency(NativeCompany.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency value) {
                this.currency = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link Action }
             *     
             */
            public Action getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link Action }
             *     
             */
            public void setAction(Action value) {
                this.action = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="Code" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class Currency {

                @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String code;
                @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String pk;
                @XmlAttribute(name = "Action")
                protected Action action;
                @XmlAttribute(name = "TableName")
                protected String tableName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the pk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPK() {
                    return pk;
                }

                /**
                 * Sets the value of the pk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPK(String value) {
                    this.pk = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Action }
                 *     
                 */
                public Action getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Action }
                 *     
                 */
                public void setAction(Action value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the tableName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTableName() {
                    return tableName;
                }

                /**
                 * Sets the value of the tableName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTableName(String value) {
                    this.tableName = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AccExchangeRateConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ConfigType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Ledger" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="JobType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ServiceDirection" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TransportMode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ExRateType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Preference" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accExchangeRateConfigurationView"
    })
    public static class AccExchangeRateConfigurationViewCollection {

        @XmlElement(name = "AccExchangeRateConfigurationView", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected List<NativeCompany.AccExchangeRateConfigurationViewCollection.AccExchangeRateConfigurationView> accExchangeRateConfigurationView;

        /**
         * Gets the value of the accExchangeRateConfigurationView property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accExchangeRateConfigurationView property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccExchangeRateConfigurationView().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NativeCompany.AccExchangeRateConfigurationViewCollection.AccExchangeRateConfigurationView }
         * 
         * 
         */
        public List<NativeCompany.AccExchangeRateConfigurationViewCollection.AccExchangeRateConfigurationView> getAccExchangeRateConfigurationView() {
            if (accExchangeRateConfigurationView == null) {
                accExchangeRateConfigurationView = new ArrayList<NativeCompany.AccExchangeRateConfigurationViewCollection.AccExchangeRateConfigurationView>();
            }
            return this.accExchangeRateConfigurationView;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ConfigType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Ledger" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="JobType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ServiceDirection" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TransportMode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ExRateType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Preference" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class AccExchangeRateConfigurationView {

            @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String pk;
            @XmlElement(name = "ConfigType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String configType;
            @XmlElement(name = "Ledger", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String ledger;
            @XmlElement(name = "JobType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String jobType;
            @XmlElement(name = "ServiceDirection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String serviceDirection;
            @XmlElement(name = "TransportMode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String transportMode;
            @XmlElement(name = "ExRateType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String exRateType;
            @XmlElement(name = "Preference", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String preference;
            @XmlElement(name = "Offset", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected Integer offset;
            @XmlElement(name = "Prompt", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected Boolean prompt;
            @XmlAttribute(name = "Action")
            protected Action action;

            /**
             * Gets the value of the pk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPK() {
                return pk;
            }

            /**
             * Sets the value of the pk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPK(String value) {
                this.pk = value;
            }

            /**
             * Gets the value of the configType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfigType() {
                return configType;
            }

            /**
             * Sets the value of the configType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfigType(String value) {
                this.configType = value;
            }

            /**
             * Gets the value of the ledger property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLedger() {
                return ledger;
            }

            /**
             * Sets the value of the ledger property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLedger(String value) {
                this.ledger = value;
            }

            /**
             * Gets the value of the jobType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJobType() {
                return jobType;
            }

            /**
             * Sets the value of the jobType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJobType(String value) {
                this.jobType = value;
            }

            /**
             * Gets the value of the serviceDirection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceDirection() {
                return serviceDirection;
            }

            /**
             * Sets the value of the serviceDirection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceDirection(String value) {
                this.serviceDirection = value;
            }

            /**
             * Gets the value of the transportMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportMode() {
                return transportMode;
            }

            /**
             * Sets the value of the transportMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransportMode(String value) {
                this.transportMode = value;
            }

            /**
             * Gets the value of the exRateType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExRateType() {
                return exRateType;
            }

            /**
             * Sets the value of the exRateType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExRateType(String value) {
                this.exRateType = value;
            }

            /**
             * Gets the value of the preference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreference() {
                return preference;
            }

            /**
             * Sets the value of the preference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreference(String value) {
                this.preference = value;
            }

            /**
             * Gets the value of the offset property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOffset() {
                return offset;
            }

            /**
             * Sets the value of the offset property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOffset(Integer value) {
                this.offset = value;
            }

            /**
             * Gets the value of the prompt property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrompt() {
                return prompt;
            }

            /**
             * Sets the value of the prompt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrompt(Boolean value) {
                this.prompt = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link Action }
             *     
             */
            public Action getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link Action }
             *     
             */
            public void setAction(Action value) {
                this.action = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CountryCode {

        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String code;
        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;
        @XmlAttribute(name = "TableName")
        protected String tableName;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
        }

        /**
         * Gets the value of the tableName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableName(String value) {
            this.tableName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GlbBranch" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Code" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BranchName" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Address1" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Address2" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="City" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="25"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="State" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="25"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PostCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Phone" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Fax" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="InternalExtension" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="WebAddress" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LocalDocLanguage" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="Email" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="254"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AccountingGroupCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddressMap" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="HomePort" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="Code" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OrgProxy" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="Code" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddressProxy" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="Code" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="25"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="OrgHeader" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="Code" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="12"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/all&gt;
     *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CountryCode" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="Code" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AccCFXUpliftConfigurationViewCollection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="ConfigType" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="3"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Ledger" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="JobType" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="3"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ServiceDirection" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="3"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="TransportMode" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="3"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="GlbCompany" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;all&gt;
     *                                                 &lt;element name="Code" minOccurs="0"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                       &lt;maxLength value="3"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/all&gt;
     *                                               &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Currency" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;all&gt;
     *                                                 &lt;element name="Code" minOccurs="0"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                       &lt;maxLength value="3"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/all&gt;
     *                                               &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                                               &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/all&gt;
     *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "glbBranch"
    })
    public static class GlbBranchCollection {

        @XmlElement(name = "GlbBranch", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected List<NativeCompany.GlbBranchCollection.GlbBranch> glbBranch;

        /**
         * Gets the value of the glbBranch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the glbBranch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGlbBranch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NativeCompany.GlbBranchCollection.GlbBranch }
         * 
         * 
         */
        public List<NativeCompany.GlbBranchCollection.GlbBranch> getGlbBranch() {
            if (glbBranch == null) {
                glbBranch = new ArrayList<NativeCompany.GlbBranchCollection.GlbBranch>();
            }
            return this.glbBranch;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Code" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BranchName" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Address1" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Address2" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="City" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="25"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="State" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="25"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PostCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Phone" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Fax" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="InternalExtension" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="WebAddress" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="60"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LocalDocLanguage" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="Email" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="254"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AccountingGroupCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddressMap" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HomePort" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="Code" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrgProxy" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="Code" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddressProxy" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="Code" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="25"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="OrgHeader" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="Code" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="12"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/all&gt;
         *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CountryCode" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="Code" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AccCFXUpliftConfigurationViewCollection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="ConfigType" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="3"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Ledger" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="JobType" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="3"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ServiceDirection" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="3"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="TransportMode" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="3"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="GlbCompany" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;all&gt;
         *                                       &lt;element name="Code" minOccurs="0"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                             &lt;maxLength value="3"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/all&gt;
         *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Currency" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;all&gt;
         *                                       &lt;element name="Code" minOccurs="0"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                             &lt;maxLength value="3"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/all&gt;
         *                                     &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                                     &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/all&gt;
         *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class GlbBranch {

            @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String pk;
            @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String code;
            @XmlElement(name = "BranchName", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String branchName;
            @XmlElement(name = "Address1", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String address1;
            @XmlElement(name = "Address2", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String address2;
            @XmlElement(name = "City", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String city;
            @XmlElement(name = "State", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String state;
            @XmlElement(name = "PostCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String postCode;
            @XmlElement(name = "Phone", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String phone;
            @XmlElement(name = "Fax", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String fax;
            @XmlElement(name = "InternalExtension", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String internalExtension;
            @XmlElement(name = "WebAddress", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String webAddress;
            @XmlElement(name = "LocalDocLanguage", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String localDocLanguage;
            @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected Boolean isActive;
            @XmlElement(name = "Email", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String email;
            @XmlElement(name = "AccountingGroupCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String accountingGroupCode;
            @XmlElement(name = "AddressMap", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected String addressMap;
            @XmlElement(name = "HomePort", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.GlbBranchCollection.GlbBranch.HomePort homePort;
            @XmlElement(name = "OrgProxy", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.GlbBranchCollection.GlbBranch.OrgProxy orgProxy;
            @XmlElement(name = "AddressProxy", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy addressProxy;
            @XmlElement(name = "CountryCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.GlbBranchCollection.GlbBranch.CountryCode countryCode;
            @XmlElement(name = "AccCFXUpliftConfigurationViewCollection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
            protected NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection accCFXUpliftConfigurationViewCollection;
            @XmlAttribute(name = "Action")
            protected Action action;

            /**
             * Gets the value of the pk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPK() {
                return pk;
            }

            /**
             * Sets the value of the pk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPK(String value) {
                this.pk = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the branchName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchName() {
                return branchName;
            }

            /**
             * Sets the value of the branchName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchName(String value) {
                this.branchName = value;
            }

            /**
             * Gets the value of the address1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress1() {
                return address1;
            }

            /**
             * Sets the value of the address1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress1(String value) {
                this.address1 = value;
            }

            /**
             * Gets the value of the address2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress2() {
                return address2;
            }

            /**
             * Sets the value of the address2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress2(String value) {
                this.address2 = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the postCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostCode() {
                return postCode;
            }

            /**
             * Sets the value of the postCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostCode(String value) {
                this.postCode = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the fax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFax() {
                return fax;
            }

            /**
             * Sets the value of the fax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFax(String value) {
                this.fax = value;
            }

            /**
             * Gets the value of the internalExtension property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternalExtension() {
                return internalExtension;
            }

            /**
             * Sets the value of the internalExtension property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternalExtension(String value) {
                this.internalExtension = value;
            }

            /**
             * Gets the value of the webAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebAddress() {
                return webAddress;
            }

            /**
             * Sets the value of the webAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebAddress(String value) {
                this.webAddress = value;
            }

            /**
             * Gets the value of the localDocLanguage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalDocLanguage() {
                return localDocLanguage;
            }

            /**
             * Sets the value of the localDocLanguage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalDocLanguage(String value) {
                this.localDocLanguage = value;
            }

            /**
             * Gets the value of the isActive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsActive() {
                return isActive;
            }

            /**
             * Sets the value of the isActive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsActive(Boolean value) {
                this.isActive = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the accountingGroupCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountingGroupCode() {
                return accountingGroupCode;
            }

            /**
             * Sets the value of the accountingGroupCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountingGroupCode(String value) {
                this.accountingGroupCode = value;
            }

            /**
             * Gets the value of the addressMap property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressMap() {
                return addressMap;
            }

            /**
             * Sets the value of the addressMap property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressMap(String value) {
                this.addressMap = value;
            }

            /**
             * Gets the value of the homePort property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.HomePort }
             *     
             */
            public NativeCompany.GlbBranchCollection.GlbBranch.HomePort getHomePort() {
                return homePort;
            }

            /**
             * Sets the value of the homePort property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.HomePort }
             *     
             */
            public void setHomePort(NativeCompany.GlbBranchCollection.GlbBranch.HomePort value) {
                this.homePort = value;
            }

            /**
             * Gets the value of the orgProxy property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.OrgProxy }
             *     
             */
            public NativeCompany.GlbBranchCollection.GlbBranch.OrgProxy getOrgProxy() {
                return orgProxy;
            }

            /**
             * Sets the value of the orgProxy property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.OrgProxy }
             *     
             */
            public void setOrgProxy(NativeCompany.GlbBranchCollection.GlbBranch.OrgProxy value) {
                this.orgProxy = value;
            }

            /**
             * Gets the value of the addressProxy property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy }
             *     
             */
            public NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy getAddressProxy() {
                return addressProxy;
            }

            /**
             * Sets the value of the addressProxy property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy }
             *     
             */
            public void setAddressProxy(NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy value) {
                this.addressProxy = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.CountryCode }
             *     
             */
            public NativeCompany.GlbBranchCollection.GlbBranch.CountryCode getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.CountryCode }
             *     
             */
            public void setCountryCode(NativeCompany.GlbBranchCollection.GlbBranch.CountryCode value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the accCFXUpliftConfigurationViewCollection property.
             * 
             * @return
             *     possible object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection }
             *     
             */
            public NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection getAccCFXUpliftConfigurationViewCollection() {
                return accCFXUpliftConfigurationViewCollection;
            }

            /**
             * Sets the value of the accCFXUpliftConfigurationViewCollection property.
             * 
             * @param value
             *     allowed object is
             *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection }
             *     
             */
            public void setAccCFXUpliftConfigurationViewCollection(NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection value) {
                this.accCFXUpliftConfigurationViewCollection = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link Action }
             *     
             */
            public Action getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link Action }
             *     
             */
            public void setAction(Action value) {
                this.action = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AccCFXUpliftConfigurationView" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="ConfigType" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="3"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Ledger" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="JobType" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="3"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ServiceDirection" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="3"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="TransportMode" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="3"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="GlbCompany" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;all&gt;
             *                             &lt;element name="Code" minOccurs="0"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                   &lt;maxLength value="3"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/all&gt;
             *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Currency" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;all&gt;
             *                             &lt;element name="Code" minOccurs="0"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                   &lt;maxLength value="3"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/all&gt;
             *                           &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *                           &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/all&gt;
             *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "accCFXUpliftConfigurationView"
            })
            public static class AccCFXUpliftConfigurationViewCollection {

                @XmlElement(name = "AccCFXUpliftConfigurationView", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected List<NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView> accCFXUpliftConfigurationView;

                /**
                 * Gets the value of the accCFXUpliftConfigurationView property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accCFXUpliftConfigurationView property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccCFXUpliftConfigurationView().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView }
                 * 
                 * 
                 */
                public List<NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView> getAccCFXUpliftConfigurationView() {
                    if (accCFXUpliftConfigurationView == null) {
                        accCFXUpliftConfigurationView = new ArrayList<NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView>();
                    }
                    return this.accCFXUpliftConfigurationView;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="ConfigType" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="3"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Ledger" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="JobType" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="3"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="ServiceDirection" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="3"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="TransportMode" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="3"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="CFXPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="CFXMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="GlbCompany" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;all&gt;
                 *                   &lt;element name="Code" minOccurs="0"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                         &lt;maxLength value="3"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/all&gt;
                 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Currency" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;all&gt;
                 *                   &lt;element name="Code" minOccurs="0"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                         &lt;maxLength value="3"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/all&gt;
                 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                 *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/all&gt;
                 *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class AccCFXUpliftConfigurationView {

                    @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String pk;
                    @XmlElement(name = "ConfigType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String configType;
                    @XmlElement(name = "Ledger", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String ledger;
                    @XmlElement(name = "JobType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String jobType;
                    @XmlElement(name = "ServiceDirection", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String serviceDirection;
                    @XmlElement(name = "TransportMode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String transportMode;
                    @XmlElement(name = "CFXPercentage", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected BigDecimal cfxPercentage;
                    @XmlElement(name = "CFXMinimum", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected BigDecimal cfxMinimum;
                    @XmlElement(name = "GlbCompany", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.GlbCompany glbCompany;
                    @XmlElement(name = "Currency", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency currency;
                    @XmlAttribute(name = "Action")
                    protected Action action;

                    /**
                     * Gets the value of the pk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPK() {
                        return pk;
                    }

                    /**
                     * Sets the value of the pk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPK(String value) {
                        this.pk = value;
                    }

                    /**
                     * Gets the value of the configType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getConfigType() {
                        return configType;
                    }

                    /**
                     * Sets the value of the configType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setConfigType(String value) {
                        this.configType = value;
                    }

                    /**
                     * Gets the value of the ledger property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLedger() {
                        return ledger;
                    }

                    /**
                     * Sets the value of the ledger property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLedger(String value) {
                        this.ledger = value;
                    }

                    /**
                     * Gets the value of the jobType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getJobType() {
                        return jobType;
                    }

                    /**
                     * Sets the value of the jobType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setJobType(String value) {
                        this.jobType = value;
                    }

                    /**
                     * Gets the value of the serviceDirection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceDirection() {
                        return serviceDirection;
                    }

                    /**
                     * Sets the value of the serviceDirection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceDirection(String value) {
                        this.serviceDirection = value;
                    }

                    /**
                     * Gets the value of the transportMode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTransportMode() {
                        return transportMode;
                    }

                    /**
                     * Sets the value of the transportMode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTransportMode(String value) {
                        this.transportMode = value;
                    }

                    /**
                     * Gets the value of the cfxPercentage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCFXPercentage() {
                        return cfxPercentage;
                    }

                    /**
                     * Sets the value of the cfxPercentage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCFXPercentage(BigDecimal value) {
                        this.cfxPercentage = value;
                    }

                    /**
                     * Gets the value of the cfxMinimum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCFXMinimum() {
                        return cfxMinimum;
                    }

                    /**
                     * Sets the value of the cfxMinimum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCFXMinimum(BigDecimal value) {
                        this.cfxMinimum = value;
                    }

                    /**
                     * Gets the value of the glbCompany property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.GlbCompany }
                     *     
                     */
                    public NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.GlbCompany getGlbCompany() {
                        return glbCompany;
                    }

                    /**
                     * Sets the value of the glbCompany property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.GlbCompany }
                     *     
                     */
                    public void setGlbCompany(NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.GlbCompany value) {
                        this.glbCompany = value;
                    }

                    /**
                     * Gets the value of the currency property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency }
                     *     
                     */
                    public NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency getCurrency() {
                        return currency;
                    }

                    /**
                     * Sets the value of the currency property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency }
                     *     
                     */
                    public void setCurrency(NativeCompany.GlbBranchCollection.GlbBranch.AccCFXUpliftConfigurationViewCollection.AccCFXUpliftConfigurationView.Currency value) {
                        this.currency = value;
                    }

                    /**
                     * Gets the value of the action property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Action }
                     *     
                     */
                    public Action getAction() {
                        return action;
                    }

                    /**
                     * Sets the value of the action property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Action }
                     *     
                     */
                    public void setAction(Action value) {
                        this.action = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;all&gt;
                     *         &lt;element name="Code" minOccurs="0"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *               &lt;maxLength value="3"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *       &lt;/all&gt;
                     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                     *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class Currency {

                        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                        protected String code;
                        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                        protected String pk;
                        @XmlAttribute(name = "Action")
                        protected Action action;
                        @XmlAttribute(name = "TableName")
                        protected String tableName;

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the pk property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPK() {
                            return pk;
                        }

                        /**
                         * Sets the value of the pk property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPK(String value) {
                            this.pk = value;
                        }

                        /**
                         * Gets the value of the action property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Action }
                         *     
                         */
                        public Action getAction() {
                            return action;
                        }

                        /**
                         * Sets the value of the action property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Action }
                         *     
                         */
                        public void setAction(Action value) {
                            this.action = value;
                        }

                        /**
                         * Gets the value of the tableName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTableName() {
                            return tableName;
                        }

                        /**
                         * Sets the value of the tableName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTableName(String value) {
                            this.tableName = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;all&gt;
                     *         &lt;element name="Code" minOccurs="0"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *               &lt;maxLength value="3"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *       &lt;/all&gt;
                     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class GlbCompany {

                        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                        protected String code;
                        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                        protected String pk;
                        @XmlAttribute(name = "Action")
                        protected Action action;

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the pk property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPK() {
                            return pk;
                        }

                        /**
                         * Sets the value of the pk property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPK(String value) {
                            this.pk = value;
                        }

                        /**
                         * Gets the value of the action property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Action }
                         *     
                         */
                        public Action getAction() {
                            return action;
                        }

                        /**
                         * Sets the value of the action property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Action }
                         *     
                         */
                        public void setAction(Action value) {
                            this.action = value;
                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="Code" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="25"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="OrgHeader" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="Code" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="12"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/all&gt;
             *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/all&gt;
             *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class AddressProxy {

                @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String code;
                @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String pk;
                @XmlElement(name = "OrgHeader", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy.OrgHeader orgHeader;
                @XmlAttribute(name = "Action")
                protected Action action;
                @XmlAttribute(name = "TableName")
                protected String tableName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the pk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPK() {
                    return pk;
                }

                /**
                 * Sets the value of the pk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPK(String value) {
                    this.pk = value;
                }

                /**
                 * Gets the value of the orgHeader property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy.OrgHeader }
                 *     
                 */
                public NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy.OrgHeader getOrgHeader() {
                    return orgHeader;
                }

                /**
                 * Sets the value of the orgHeader property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy.OrgHeader }
                 *     
                 */
                public void setOrgHeader(NativeCompany.GlbBranchCollection.GlbBranch.AddressProxy.OrgHeader value) {
                    this.orgHeader = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Action }
                 *     
                 */
                public Action getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Action }
                 *     
                 */
                public void setAction(Action value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the tableName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTableName() {
                    return tableName;
                }

                /**
                 * Sets the value of the tableName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTableName(String value) {
                    this.tableName = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="Code" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="12"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/all&gt;
                 *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class OrgHeader {

                    @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String code;
                    @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                    protected String pk;
                    @XmlAttribute(name = "Action")
                    protected Action action;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the pk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPK() {
                        return pk;
                    }

                    /**
                     * Sets the value of the pk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPK(String value) {
                        this.pk = value;
                    }

                    /**
                     * Gets the value of the action property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Action }
                     *     
                     */
                    public Action getAction() {
                        return action;
                    }

                    /**
                     * Sets the value of the action property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Action }
                     *     
                     */
                    public void setAction(Action value) {
                        this.action = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="Code" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class CountryCode {

                @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String code;
                @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String pk;
                @XmlAttribute(name = "Action")
                protected Action action;
                @XmlAttribute(name = "TableName")
                protected String tableName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the pk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPK() {
                    return pk;
                }

                /**
                 * Sets the value of the pk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPK(String value) {
                    this.pk = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Action }
                 *     
                 */
                public Action getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Action }
                 *     
                 */
                public void setAction(Action value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the tableName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTableName() {
                    return tableName;
                }

                /**
                 * Sets the value of the tableName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTableName(String value) {
                    this.tableName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="Code" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class HomePort {

                @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String code;
                @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String pk;
                @XmlAttribute(name = "Action")
                protected Action action;
                @XmlAttribute(name = "TableName")
                protected String tableName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the pk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPK() {
                    return pk;
                }

                /**
                 * Sets the value of the pk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPK(String value) {
                    this.pk = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Action }
                 *     
                 */
                public Action getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Action }
                 *     
                 */
                public void setAction(Action value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the tableName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTableName() {
                    return tableName;
                }

                /**
                 * Sets the value of the tableName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTableName(String value) {
                    this.tableName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="Code" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
             *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class OrgProxy {

                @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String code;
                @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
                protected String pk;
                @XmlAttribute(name = "Action")
                protected Action action;
                @XmlAttribute(name = "TableName")
                protected String tableName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the pk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPK() {
                    return pk;
                }

                /**
                 * Sets the value of the pk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPK(String value) {
                    this.pk = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Action }
                 *     
                 */
                public Action getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Action }
                 *     
                 */
                public void setAction(Action value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the tableName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTableName() {
                    return tableName;
                }

                /**
                 * Sets the value of the tableName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTableName(String value) {
                    this.tableName = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LocalCurrency {

        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String code;
        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;
        @XmlAttribute(name = "TableName")
        protected String tableName;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
        }

        /**
         * Gets the value of the tableName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableName(String value) {
            this.tableName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class OrgProxy {

        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String code;
        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;
        @XmlAttribute(name = "TableName")
        protected String tableName;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
        }

        /**
         * Gets the value of the tableName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableName(String value) {
            this.tableName = value;
        }

    }

}
