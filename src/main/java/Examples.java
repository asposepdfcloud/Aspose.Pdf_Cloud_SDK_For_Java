/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.aspose.client.ApiException;
import com.aspose.pdf.api.PdfApi;
import com.aspose.pdf.model.AppendDocument;
import com.aspose.pdf.model.DocumentProperty;
import com.aspose.pdf.model.Field;
import com.aspose.pdf.model.Fields;
import com.aspose.pdf.model.Link;
import com.aspose.pdf.model.FieldsResponse;
import com.aspose.pdf.model.ImageResponse;
import com.aspose.pdf.model.Signature;
import com.aspose.pdf.model.Link;
import com.aspose.pdf.model.Rectangle;
import com.aspose.pdf.model.SaaSposeResponse;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SQL
 */
public class Examples {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		PdfApi pdf = new PdfApi();
		// Imran Anwar
		String appSID = "b8d0bf27-62f0-4b5c-a9d7-83268ac53861";
		String apiKey = "76706419dc70d5a2c37421570d1405c8";

		pdf.setBasePath("http://api.aspose.com/v1.1");
		pdf.getInvoker().addDefaultHeader("apiKey", apiKey);
		pdf.getInvoker().addDefaultHeader("appSID", appSID);
		
		try{

			File file = new File("e:\\temp\\123.pdf");
			
			//System.out.println(pdf.GetFields("ABFillablewfields.pdf", "", ""));
			
//			Fields body = new Fields();
//			List<Field> fields = new ArrayList();
//			Field field = new Field();			
//			List<Link> links = new ArrayList();
//			Link link = new Link();
//			List<String> values = new ArrayList();
//			List<Integer> selectedItems = new ArrayList();
//			Rectangle rect = new Rectangle();
//			rect.setX(0);
//			rect.setY(0);
//			
//			selectedItems.add(1);
//			values.add("NewFieldValue");
//			
//			link.setHref("http://api.aspose.com/v1.1/pdf/ABFillablewfields.pdf/fields/NewField");
//			link.setRel("self");
//			link.setTitle("NewField");
//			link.setType("link");
//			
//			field.setName("NewField");
//			
//			field.setValues(values);
//			field.setRect(rect);
//			field.setSelectedItems(selectedItems);
//			field.setType(0);
//			links.add(link);
//			field.setLinks(links);
//			fields.add(field);
//			body.setList(fields);
//			
//			
//			pdf.PostCreateField("ABFillablewfields.pdf", 1, "", "", field);
//			
//			System.out.println(pdf.PutUpdateField("ABFillablewfields.pdf", "", "", "dvDate_1", field));
//			System.out.println(pdf.PutUpdateFields("ABFillablewfields.pdf", "", "", body));

			
			//System.out.println(pdf.GetField("ABFillablewfields.pdf", "dvDate_2","", ""));
			
//			System.out.println(pdf.GetImages("Lenovo_Tablet_2_Datasheet.pdf", 1, "", ""));
//			System.out.println(pdf.GetImage("Lenovo_Tablet_2_Datasheet.pdf", 1, 1, "", ""));
//			System.out.println(pdf.GetImageWithFormat("Lenovo_Tablet_2_Datasheet.pdf", 1, 1, "jpg", 100, 100, "", "") );
			
			//System.out.println(pdf.GetExtractBarcodes("Barcodes.pdf", 2, 1, apiKey, apiKey));
			
			//System.out.println(pdf.PutConvertDocument("pdf", "", "files", file));
			
			//System.out.println(pdf.GetDocumentBookmarks("pst-barcode-doc.pdf", "", ""));
			//System.out.println(pdf.GetDocumentBookmarksChildren("pst-barcode-doc.pdf", "7", "", ""));
			
//			System.out.println(pdf.GetDocumentProperties("pst-barcode-doc.pdf", "", ""));
//			System.out.println(pdf.GetDocumentProperty("pst-barcode-doc.pdf", "Creator", "", ""));
			
			//System.out.println(pdf.GetSegments("pst-barcode-doc.pdf", 2, 1, "", "", ""));
			//System.out.println(pdf.GetSegment("pst-barcode-doc.pdf", 2, 2,1, "", ""));
			
			//System.out.println(pdf.GetSegmentTextFormat("pst-barcode-doc.pdf", 2, 2, 1, "", ""));
			
			//System.out.println(pdf.PutAddNewPage("test.pdf", "", ""));
			//System.out.println(pdf.PutConvertDocument("tiff", "", "", file));
			
			//pdf.PutCreateDocument("check.pdf", "", "", "", "", "");
			
			//pdf.GetPageAnnotations("Lenovo_Tablet_2_Datasheet.pdf", 2, "", "");
			//pdf.GetPageLinkAnnotations("Lenovo_Tablet_2_Datasheet.pdf", 1, "", "");
			//pdf.GetPageLinkAnnotationByIndex("Lenovo_Tablet_2_Datasheet.pdf", 2, 2, "", "");
			
			
			
//			Signature sig = new Signature();
//			sig.setContact("Imran Anwar");
//			sig.setAuthority("Imran Anwar");
//			pdf.PostSignDocument("newsign.pdf", "", "", sig);
			
//			AppendDocument ad = new AppendDocument();
//			ad.setDocument("Kidz.pdf");
//			ad.setStartPage(2);
//			ad.setEndPage(3);
//			pdf.PostAppendDocument("test.pdf", null, 2, 3, "", "", ad);
			
//			DocumentProperty dp = new DocumentProperty();
//			dp.setBuiltIn(false);
//			dp.setName("newproperty");
//			dp.setValue("newValuse");
//			List<Link> links = new ArrayList();
//			Link l = new Link();
//			l.setHref("http://testing.com");
//			l.setTitle("Testing");
//			links.add(l);
//
//			dp.setLinks(links);
//			pdf.PutSetProperty("test.pdf", "newproperty", "", "", dp);
			
//		String name = "Lenovo_Tablet_2_Datasheet.pdf";
//		Integer pageNumber = 1;
//		Integer imageNumber = 1;
//		String imageFile = "";
		String storage = "";
		String folder = "";
//
//		ImageResponse expResult = new ImageResponse();
//		expResult.setStatus("OK");
//		file = new File("e:\\temp\\digi.gif");
//		
//		System.out.println(pdf.GetImages("Lenovo_Tablet_2_Datasheet.pdf", 1, storage, folder));
//		System.out.println(pdf.PostReplaceImage(name, pageNumber, imageNumber, "digi.gif", storage, folder, file));	

			
		String name = "pst-barcode-doc.pdf";
//		String propertyName = "Title";
//		
//		DocumentProperty property = new DocumentProperty();
//		property.setName("newproperty");
//		property.setValue("This is new");
//		property.setBuiltIn(false);		
//		List<Link> links = new ArrayList();
//		Link l = new Link();
//		l.setHref("http://testing.com");
//		l.setTitle("Testing");
//		links.add(l);
//		property.setLinks(links);
//			
//		System.out.println(pdf.GetDocumentProperties(name, "",""));
//		System.out.println(pdf.PutSetProperty(name, "newproperty", storage, folder, property));
//		System.out.println(pdf.DeleteProperty(name, "newproperty", storage, folder));
		
//		Field body = new Field();
//	
//		List<Link> links = new ArrayList();
//		
//		List<String> values = new ArrayList();
//		List<Integer> selectedItems = new ArrayList();
//		Link link = new Link();
//		Rectangle rect = new Rectangle();
//		rect.setX(0);
//		rect.setY(0);
//
//		selectedItems.add(1);
//		values.add("NewFieldValue");
//
//		link.setHref("http://api.aspose.com/v1.1/pdf/ABFillablewfields.pdf/fields/NewField");
//		link.setRel("self");
//		link.setTitle("NewField");
//		link.setType("link");
//
//		body.setName("NewField");
//
//		body.setValues(values);
//		body.setRect(rect);
//		body.setSelectedItems(selectedItems);
//
//		body.setName("NewField");
//		body.setType(3);
//		links.add(link);
//		body.setLinks(links);
//		
//		pdf.PostCreateField("test.pdf", 1, storage, folder, body);
		
		
		
		Field field = new Field();
	
		List<Link> links = new ArrayList();
		
		List<String> values = new ArrayList();
		List<Integer> selectedItems = new ArrayList();
		Link link = new Link();
		Rectangle rect = new Rectangle();
		rect.setX(100);
		rect.setY(100);
		rect.setHeight(100);
		rect.setWidth(200);

		selectedItems.add(1);
		values.add("NewFieldValue");

		link.setHref("http://api.aspose.com/v1.1/pdf/ABFillablewfields.pdf/fields/NewField");
		link.setRel("self");
		link.setTitle("NewField");
		link.setType("link");

		field.setName("NewField");

		field.setValues(values);
		field.setRect(rect);
		field.setSelectedItems(selectedItems);

		field.setName("signature");
		field.setType(3);
		links.add(link);
		field.setLinks(links);
		
		name = "signature.pdf";
		Signature sig = new Signature();
		sig.setAuthority("Authority");
		sig.setContact("Imran");
		sig.setDate("1-1-2015");
		sig.setFormFieldName("signature");
		sig.setLocation("");
		sig.setPassword("password");
		sig.setRectangle(rect);
		sig.setSignaturePath("temp.pfx");
		sig.setSignatureType("PKCS7");
		sig.setVisible(false);

		
		//pdf.GetFields(name, storage, folder);
		pdf.PutUpdateField(name, storage, folder,"signature", field);
		pdf.PostSignDocument(name, storage, folder, sig);

		
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		


		
		
	}
}
