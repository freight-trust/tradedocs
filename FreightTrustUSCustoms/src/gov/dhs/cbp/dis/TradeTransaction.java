/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getTransactionCategory <em>Transaction Category</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getEntry <em>Entry</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getEntrySummary <em>Entry Summary</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getBill <em>Bill</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getISFNumber <em>ISF Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getITN <em>ITN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getXTN <em>XTN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getFTZAdmissionNbr <em>FTZ Admission Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradeTransaction#getOtherTransaction <em>Other Transaction</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction()
 * @model extendedMetaData="name='TradeTransaction' kind='elementOnly'"
 * @generated
 */
public interface TradeTransaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SINGLE_TXN or CONTINUOUS ('Continous' documents are kept on file and associated with the FILER and not with any particular transaction)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Category</em>' attribute.
	 * @see #setTransactionCategory(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_TransactionCategory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TransactionCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionCategory();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradeTransaction#getTransactionCategory <em>Transaction Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Category</em>' attribute.
	 * @see #getTransactionCategory()
	 * @generated
	 */
	void setTransactionCategory(String value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.EntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Entry Number or Entry Summary Number that the document in this message is to be associated with. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryType> getEntry();

	/**
	 * Returns the value of the '<em><b>Entry Summary</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.EntrySummaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Entry Number or Entry Summary Number that the document in this message is to be associated with. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Summary</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_EntrySummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntrySummary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntrySummaryType> getEntrySummary();

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.BillType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Bill Info that the document in this message is to be associated with. SCAC is required. BillFileDate is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bill</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_Bill()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bill' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BillType> getBill();

	/**
	 * Returns the value of the '<em><b>ISF Number</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.ISFNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - ISF TransactionNumber that the document in this message is to be associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ISF Number</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_ISFNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISFNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ISFNumberType> getISFNumber();

	/**
	 * Returns the value of the '<em><b>ITN</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.ITNType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ITN of Export Data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ITN</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_ITN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ITN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ITNType> getITN();

	/**
	 * Returns the value of the '<em><b>XTN</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.XTNType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XTN of Export Data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XTN</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_XTN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XTN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XTNType> getXTN();

	/**
	 * Returns the value of the '<em><b>FTZ Admission Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Foreign Trade Zone Admissions Nbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTZ Admission Nbr</em>' attribute.
	 * @see #setFTZAdmissionNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_FTZAdmissionNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FTZAdmissionNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFTZAdmissionNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradeTransaction#getFTZAdmissionNbr <em>FTZ Admission Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTZ Admission Nbr</em>' attribute.
	 * @see #getFTZAdmissionNbr()
	 * @generated
	 */
	void setFTZAdmissionNbr(String value);

	/**
	 * Returns the value of the '<em><b>Importer Of Record Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Importer of Record Nbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Of Record Nbr</em>' attribute.
	 * @see #setImporterOfRecordNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_ImporterOfRecordNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImporterOfRecordNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImporterOfRecordNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradeTransaction#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Of Record Nbr</em>' attribute.
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 */
	void setImporterOfRecordNbr(String value);

	/**
	 * Returns the value of the '<em><b>Other Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.OtherTransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - A Transaction that is not covered by the above options. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Transaction</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeTransaction_OtherTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherTransaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherTransactionType> getOtherTransaction();

} // TradeTransaction
