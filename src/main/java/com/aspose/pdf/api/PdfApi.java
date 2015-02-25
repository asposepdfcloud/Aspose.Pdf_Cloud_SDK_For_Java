package com.aspose.pdf.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.pdf.model.BookmarksResponse;
import com.aspose.pdf.model.DocumentResponse;
import com.aspose.pdf.model.PageTextReplaceResponse;
import com.aspose.pdf.model.AttachmentsResponse;
import com.aspose.pdf.model.AttachmentResponse;
import com.aspose.pdf.model.TextItemsResponse;
import com.aspose.pdf.model.FieldResponse;
import com.aspose.pdf.model.Fields;
import com.aspose.pdf.model.WordCountResponse;
import com.aspose.pdf.model.DocumentProperty;
import com.aspose.pdf.model.Field;
import com.aspose.pdf.model.DocumentPagesResponse;
import com.aspose.pdf.model.Stamp;
import com.aspose.pdf.model.DocumentPropertyResponse;
import com.aspose.pdf.model.AppendDocument;
import com.aspose.pdf.model.TextReplace;
import com.aspose.pdf.model.MergeDocuments;
import com.aspose.pdf.model.SaaSposeResponse;
import com.aspose.pdf.model.AnnotationsResponse;
import com.aspose.pdf.model.TextFormatResponse;
import com.aspose.pdf.model.ResponseMessage;
import com.aspose.pdf.model.BarcodeResponseList;
import com.aspose.pdf.model.FieldsResponse;
import com.aspose.pdf.model.TextReplaceListRequest;
import com.aspose.pdf.model.TextItemResponse;
import com.aspose.pdf.model.LinkAnnotationsResponse;
import com.aspose.pdf.model.DocumentPropertiesResponse;
import com.aspose.pdf.model.LinkAnnotationResponse;
import com.aspose.pdf.model.TiffExportOptions;
import com.aspose.pdf.model.DocumentTextReplaceResponse;
import com.aspose.pdf.model.SplitResultResponse;
import com.aspose.pdf.model.AnnotationResponse;
import com.aspose.pdf.model.ImagesResponse;
import com.aspose.pdf.model.Signature;
import com.aspose.pdf.model.ImageResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class PdfApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageAnnotation
	* Read document page annotation by its number.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param annotationNumber	Integer	The annotation number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AnnotationResponse
	*/

  public AnnotationResponse GetPageAnnotation (String name, Integer pageNumber, Integer annotationNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || annotationNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/annotations/{annotationNumber}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(annotationNumber!=null)
      queryParams.put("annotationNumber", String.valueOf(annotationNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AnnotationResponse) ApiInvoker.deserialize(response, "", AnnotationResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageAnnotations
	* Read documant page annotations.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AnnotationsResponse
	*/

  public AnnotationsResponse GetPageAnnotations (String name, Integer pageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/annotations/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AnnotationsResponse) ApiInvoker.deserialize(response, "", AnnotationsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentAttachmentByIndex
	* Read document attachment info by its index.
	* @param name	String	The document name.
	* @param attachmentIndex	Integer	The attachment index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AttachmentResponse
	*/

  public AttachmentResponse GetDocumentAttachmentByIndex (String name, Integer attachmentIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || attachmentIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/attachments/{attachmentIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(attachmentIndex!=null)
      queryParams.put("attachmentIndex", String.valueOf(attachmentIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AttachmentResponse) ApiInvoker.deserialize(response, "", AttachmentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentAttachments
	* Read document attachments info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AttachmentsResponse
	*/

  public AttachmentsResponse GetDocumentAttachments (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/attachments/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AttachmentsResponse) ApiInvoker.deserialize(response, "", AttachmentsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDownloadDocumentAttachmentByIndex
	* Download document attachment content by its index.
	* @param name	String	The document name.
	* @param attachmentIndex	Integer	The attachment index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDownloadDocumentAttachmentByIndex (String name, Integer attachmentIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || attachmentIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/attachments/{attachmentIndex}/download/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(attachmentIndex!=null)
      queryParams.put("attachmentIndex", String.valueOf(attachmentIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetExtractBarcodes
	* Recognize barcodes.
	* @param name	String	Document name.
	* @param pageNumber	Integer	Page number.
	* @param imageNumber	Integer	Image number.
	* @param storage	String	Document storage.
	* @param folder	String	Document folder.
	* @return BarcodeResponseList
	*/

  public BarcodeResponseList GetExtractBarcodes (String name, Integer pageNumber, Integer imageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || imageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}/recognize/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(imageNumber!=null)
      queryParams.put("imageNumber", String.valueOf(imageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (BarcodeResponseList) ApiInvoker.deserialize(response, "", BarcodeResponseList.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentBookmarks
	* Read document bookmarks.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return BookmarksResponse
	*/

  public BookmarksResponse GetDocumentBookmarks (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/bookmarks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (BookmarksResponse) ApiInvoker.deserialize(response, "", BookmarksResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentBookmarksChildren
	* Read document bookmark/bookmarks (including children).
	* @param name	String	The document name.
	* @param bookmarkPath	String	The bookmark path.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentBookmarksChildren (String name, String bookmarkPath, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/bookmarks/{bookmarkPath}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(bookmarkPath!=null)
      queryParams.put("bookmarkPath", String.valueOf(bookmarkPath));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocument
	* Read common document info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocument (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentWithFormat
	* Read common document info or convert to some format if the format specified.
	* @param name	String	The document name.
	* @param format	String	The format to convert.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param outPath	String	Path to save result
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentWithFormat (String name, String format, String storage, String folder, String outPath) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/?appSid={appSid}&amp;toFormat={toFormat}&amp;storage={storage}&amp;folder={folder}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSignDocument
	* Sign document.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Signature	with signature data.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostSignDocument (String name, String storage, String folder, Signature body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/sign/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSplitDocument
	* Split document to parts.
	* @param name	String	Document name.
	* @param format	String	Resulting documents format.
	* @param from	Integer	Start page if defined.
	* @param to	Integer	End page if defined.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SplitResultResponse
	*/

  public SplitResultResponse PostSplitDocument (String name, String format, Integer from, Integer to, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/split/?appSid={appSid}&amp;toFormat={toFormat}&amp;from={from}&amp;to={to}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(from!=null)
      queryParams.put("from", String.valueOf(from));
    if(to!=null)
      queryParams.put("to", String.valueOf(to));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SplitResultResponse) ApiInvoker.deserialize(response, "", SplitResultResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutConvertDocument
	* Convert document from request content to format specified.
	* @param format	String	The format to convert.
	* @param url	String	
	* @param outPath	String	Path to save result
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutConvertDocument (String format, String url, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/convert/?appSid={appSid}&amp;toFormat={toFormat}&amp;url={url}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(url!=null)
      queryParams.put("url", String.valueOf(url));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutCreateDocument
	* Create new document.
	* @param name	String	The new document name.
	* @param templateFile	String	The template file server path if defined.
	* @param dataFile	String	The data file path (for xml template only).
	* @param templateType	String	The template type, can be xml or html.
	* @param storage	String	The document storage.
	* @param folder	String	The new document folder.
	* @return DocumentResponse
	*/

  public DocumentResponse PutCreateDocument (String name, String templateFile, String dataFile, String templateType, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/?appSid={appSid}&amp;templateFile={templateFile}&amp;dataFile={dataFile}&amp;templateType={templateType}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(templateFile!=null)
      queryParams.put("templateFile", String.valueOf(templateFile));
    if(dataFile!=null)
      queryParams.put("dataFile", String.valueOf(dataFile));
    if(templateType!=null)
      queryParams.put("templateType", String.valueOf(templateType));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostAppendDocument
	* Append document to existing one.
	* @param name	String	The original document name.
	* @param appendFile	String	Append file server path.
	* @param startPage	Integer	Appending start page.
	* @param endPage	Integer	Appending end page.
	* @param storage	String	The documents storage.
	* @param folder	String	The original document folder.
	* @param body	AppendDocument	with the append document data.
	* @return DocumentResponse
	*/

  public DocumentResponse PostAppendDocument (String name, String appendFile, Integer startPage, Integer endPage, String storage, String folder, AppendDocument body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/appendDocument/?appSid={appSid}&amp;appendFile={appendFile}&amp;startPage={startPage}&amp;endPage={endPage}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(appendFile!=null)
      queryParams.put("appendFile", String.valueOf(appendFile));
    if(startPage!=null)
      queryParams.put("startPage", String.valueOf(startPage));
    if(endPage!=null)
      queryParams.put("endPage", String.valueOf(endPage));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutMergeDocuments
	* Merge a list of documents.
	* @param name	String	Resulting documen name.
	* @param storage	String	Resulting document storage.
	* @param folder	String	Resulting document folder.
	* @param body	MergeDocuments	with a list of documents.
	* @return DocumentResponse
	*/

  public DocumentResponse PutMergeDocuments (String name, String storage, String folder, MergeDocuments body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/merge/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutDocumentSaveAsTiff
	* Save document as Tiff image.
	* @param name	String	The document name.
	* @param resultFile	String	The resulting file.
	* @param brightness	Float	The image brightness.
	* @param compression	String	Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None.
	* @param colorDepth	String	Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp.
	* @param leftMargin	Integer	Left image margin.
	* @param rightMargin	Integer	Right image margin.
	* @param topMargin	Integer	Top image margin.
	* @param bottomMargin	Integer	Bottom image margin.
	* @param orientation	String	Image orientation. Possible values are: None, Landscape, Portait.
	* @param skipBlankPages	Boolean	Skip blank pages flag.
	* @param width	Integer	Image width.
	* @param height	Integer	Image height.
	* @param xResolution	Integer	Horizontal resolution.
	* @param yResolution	Integer	Vertical resolution.
	* @param pageIndex	Integer	Start page to export.
	* @param pageCount	Integer	Number of pages to export.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	TiffExportOptions	with tiff export options.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PutDocumentSaveAsTiff (String name, String resultFile, Float brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder, TiffExportOptions body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/SaveAs/tiff/?appSid={appSid}&amp;resultFile={resultFile}&amp;brightness={brightness}&amp;compression={compression}&amp;colorDepth={colorDepth}&amp;leftMargin={leftMargin}&amp;rightMargin={rightMargin}&amp;topMargin={topMargin}&amp;bottomMargin={bottomMargin}&amp;orientation={orientation}&amp;skipBlankPages={skipBlankPages}&amp;width={width}&amp;height={height}&amp;xResolution={xResolution}&amp;yResolution={yResolution}&amp;pageIndex={pageIndex}&amp;pageCount={pageCount}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resultFile!=null)
      queryParams.put("resultFile", String.valueOf(resultFile));
    if(brightness!=null)
      queryParams.put("brightness", String.valueOf(brightness));
    if(compression!=null)
      queryParams.put("compression", String.valueOf(compression));
    if(colorDepth!=null)
      queryParams.put("colorDepth", String.valueOf(colorDepth));
    if(leftMargin!=null)
      queryParams.put("leftMargin", String.valueOf(leftMargin));
    if(rightMargin!=null)
      queryParams.put("rightMargin", String.valueOf(rightMargin));
    if(topMargin!=null)
      queryParams.put("topMargin", String.valueOf(topMargin));
    if(bottomMargin!=null)
      queryParams.put("bottomMargin", String.valueOf(bottomMargin));
    if(orientation!=null)
      queryParams.put("orientation", String.valueOf(orientation));
    if(skipBlankPages!=null)
      queryParams.put("skipBlankPages", String.valueOf(skipBlankPages));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(xResolution!=null)
      queryParams.put("xResolution", String.valueOf(xResolution));
    if(yResolution!=null)
      queryParams.put("yResolution", String.valueOf(yResolution));
    if(pageIndex!=null)
      queryParams.put("pageIndex", String.valueOf(pageIndex));
    if(pageCount!=null)
      queryParams.put("pageCount", String.valueOf(pageCount));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetField
	* Get document field by name.
	* @param name	String	The document name.
	* @param fieldName	String	The field name/
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return FieldResponse
	*/

  public FieldResponse GetField (String name, String fieldName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || fieldName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/fields/{fieldName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(fieldName!=null)
      queryParams.put("fieldName", String.valueOf(fieldName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FieldResponse) ApiInvoker.deserialize(response, "", FieldResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetFields
	* Get document fields.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return FieldsResponse
	*/

  public FieldsResponse GetFields (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/fields/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FieldsResponse) ApiInvoker.deserialize(response, "", FieldsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostCreateField
	* Create field.
	* @param name	String	The document name.
	* @param page	Integer	Document page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Field	with the field data.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostCreateField (String name, Integer page, String storage, String folder, Field body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || page == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/fields/?appSid={appSid}&amp;page={page}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(page!=null)
      queryParams.put("page", String.valueOf(page));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutUpdateField
	* Update field.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fieldName	String	
	* @param body	Field	with the field data.
	* @return FieldResponse
	*/

  public FieldResponse PutUpdateField (String name, String storage, String folder, String fieldName, Field body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || fieldName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/fields/{fieldName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fieldName!=null)
      queryParams.put("fieldName", String.valueOf(fieldName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (FieldResponse) ApiInvoker.deserialize(response, "", FieldResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutUpdateFields
	* Update fields.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Fields	with the fields data.
	* @return FieldsResponse
	*/

  public FieldsResponse PutUpdateFields (String name, String storage, String folder, Fields body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/fields/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (FieldsResponse) ApiInvoker.deserialize(response, "", FieldsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetFragment
	* Read page fragment.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param fragmentNumber	Integer	
	* @param withEmpty	String	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetFragment (String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || fragmentNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(fragmentNumber!=null)
      queryParams.put("fragmentNumber", String.valueOf(fragmentNumber));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetFragments
	* Read page fragments.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param withEmpty	String	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetFragments (String name, Integer pageNumber, String withEmpty, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetFragmentTextFormat
	* Read page fragment text format.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param fragmentNumber	Integer	
	* @param storage	String	
	* @param folder	String	
	* @return TextFormatResponse
	*/

  public TextFormatResponse GetFragmentTextFormat (String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || fragmentNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/textFormat/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(fragmentNumber!=null)
      queryParams.put("fragmentNumber", String.valueOf(fragmentNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextFormatResponse) ApiInvoker.deserialize(response, "", TextFormatResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSegment
	* Read segment.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param fragmentNumber	Integer	
	* @param segmentNumber	Integer	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemResponse
	*/

  public TextItemResponse GetSegment (String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || fragmentNumber == null || segmentNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(fragmentNumber!=null)
      queryParams.put("fragmentNumber", String.valueOf(fragmentNumber));
    if(segmentNumber!=null)
      queryParams.put("segmentNumber", String.valueOf(segmentNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemResponse) ApiInvoker.deserialize(response, "", TextItemResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSegments
	* Read fragment segments.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param fragmentNumber	Integer	
	* @param withEmpty	String	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetSegments (String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || fragmentNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(fragmentNumber!=null)
      queryParams.put("fragmentNumber", String.valueOf(fragmentNumber));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSegmentTextFormat
	* Read segment text format.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param fragmentNumber	Integer	
	* @param segmentNumber	Integer	
	* @param storage	String	
	* @param folder	String	
	* @return TextFormatResponse
	*/

  public TextFormatResponse GetSegmentTextFormat (String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || fragmentNumber == null || segmentNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber}/texttoFormat/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(fragmentNumber!=null)
      queryParams.put("fragmentNumber", String.valueOf(fragmentNumber));
    if(segmentNumber!=null)
      queryParams.put("segmentNumber", String.valueOf(segmentNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextFormatResponse) ApiInvoker.deserialize(response, "", TextFormatResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImage
	* Read document image by number.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param imageNumber	Integer	The image format.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetImage (String name, Integer pageNumber, Integer imageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || imageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(imageNumber!=null)
      queryParams.put("imageNumber", String.valueOf(imageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImages
	* Read document images.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ImagesResponse
	*/

  public ImagesResponse GetImages (String name, Integer pageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/images/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ImagesResponse) ApiInvoker.deserialize(response, "", ImagesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageWithFormat
	* Extract document image in format specified.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param imageNumber	Integer	The image format.
	* @param format	String	Image format to convert, if not specified the common image data is read.
	* @param width	Integer	The converted image width.
	* @param height	Integer	The converted image height.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageWithFormat (String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || imageNumber == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}/?toFormat={toFormat}&amp;appSid={appSid}&amp;width={width}&amp;height={height}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(imageNumber!=null)
      queryParams.put("imageNumber", String.valueOf(imageNumber));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostReplaceImage
	* Replace document image.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param imageNumber	Integer	The image number.
	* @param imageFile	String	Path to image file if specified. Request content is used otherwise.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param file	File	
	* @return ImageResponse
	*/

  public ImageResponse PostReplaceImage (String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || imageNumber == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}/?appSid={appSid}&amp;imageFile={imageFile}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(imageNumber!=null)
      queryParams.put("imageNumber", String.valueOf(imageNumber));
    if(imageFile!=null)
      queryParams.put("imageFile", String.valueOf(imageFile));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ImageResponse) ApiInvoker.deserialize(response, "", ImageResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageLinkAnnotationByIndex
	* Read document page link annotation by its index.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param linkIndex	Integer	The link index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return LinkAnnotationResponse
	*/

  public LinkAnnotationResponse GetPageLinkAnnotationByIndex (String name, Integer pageNumber, Integer linkIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || linkIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/links/{linkIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(linkIndex!=null)
      queryParams.put("linkIndex", String.valueOf(linkIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (LinkAnnotationResponse) ApiInvoker.deserialize(response, "", LinkAnnotationResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageLinkAnnotations
	* Read document page link annotations.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return LinkAnnotationsResponse
	*/

  public LinkAnnotationsResponse GetPageLinkAnnotations (String name, Integer pageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/links/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (LinkAnnotationsResponse) ApiInvoker.deserialize(response, "", LinkAnnotationsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeletePage
	* Delete document page by its number.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeletePage (String name, Integer pageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPage
	* Read document page info.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetPage (String name, Integer pageNumber, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPages
	* Read document pages info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentPagesResponse
	*/

  public DocumentPagesResponse GetPages (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPagesResponse) ApiInvoker.deserialize(response, "", DocumentPagesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageWithFormat
	* Convert document page to format specified.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param format	String	The format to convert if specified.
	* @param width	Integer	The converted image width.
	* @param height	Integer	The converted image height.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetPageWithFormat (String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/?appSid={appSid}&amp;toFormat={toFormat}&amp;width={width}&amp;height={height}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetWordsPerPage
	* Get number of words per document page.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return WordCountResponse
	*/

  public WordCountResponse GetWordsPerPage (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/wordCount/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (WordCountResponse) ApiInvoker.deserialize(response, "", WordCountResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostMovePage
	* Move page to new position.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param newIndex	Integer	The new page position/index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostMovePage (String name, Integer pageNumber, Integer newIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null || newIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/movePage/?newIndex={newIndex}&amp;appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(newIndex!=null)
      queryParams.put("newIndex", String.valueOf(newIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSignPage
	* Sign page.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Signature	with the signature data.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostSignPage (String name, Integer pageNumber, String storage, String folder, Signature body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || pageNumber == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/sign/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutAddNewPage
	* Add new page to end of the document.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentPagesResponse
	*/

  public DocumentPagesResponse PutAddNewPage (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPagesResponse) ApiInvoker.deserialize(response, "", DocumentPagesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutPageAddStamp
	* Add page stamp.
	* @param name	String	The document name.
	* @param pageNumber	Integer	The page number.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Stamp	with data.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PutPageAddStamp (String name, Integer pageNumber, String storage, String folder, Stamp body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || pageNumber == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/stamp/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProperties
	* Delete document properties.
	* @param name	String	
	* @param storage	String	
	* @param folder	String	
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProperties (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/documentproperties/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProperty
	* Delete document property.
	* @param name	String	
	* @param propertyName	String	
	* @param storage	String	
	* @param folder	String	
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProperty (String name, String propertyName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperties
	* Read document properties.
	* @param name	String	
	* @param storage	String	
	* @param folder	String	
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse GetDocumentProperties (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/documentproperties/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperty
	* Read document property by name.
	* @param name	String	
	* @param propertyName	String	
	* @param storage	String	
	* @param folder	String	
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse GetDocumentProperty (String name, String propertyName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSetProperty
	* Add/update document property.
	* @param name	String	
	* @param propertyName	String	
	* @param storage	String	
	* @param folder	String	
	* @param body	DocumentProperty	
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse PutSetProperty (String name, String propertyName, String storage, String folder, DocumentProperty body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || propertyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetPageTextItems
	* Read page text items.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param withEmpty	String	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetPageTextItems (String name, Integer pageNumber, String withEmpty, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || pageNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/textItems/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTextItems
	* Read document text items.
	* @param name	String	
	* @param withEmpty	String	
	* @param storage	String	
	* @param folder	String	
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetTextItems (String name, String withEmpty, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/textItems/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentReplaceText
	* Document's replace text method.
	* @param name	String	
	* @param storage	String	
	* @param folder	String	
	* @param body	TextReplace	
	* @return DocumentTextReplaceResponse
	*/

  public DocumentTextReplaceResponse PostDocumentReplaceText (String name, String storage, String folder, TextReplace body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/replaceText/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentTextReplaceResponse) ApiInvoker.deserialize(response, "", DocumentTextReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentReplaceTextList
	* Document's replace text method.
	* @param name	String	
	* @param storage	String	
	* @param folder	String	
	* @param body	TextReplaceListRequest	
	* @return DocumentTextReplaceResponse
	*/

  public DocumentTextReplaceResponse PostDocumentReplaceTextList (String name, String storage, String folder, TextReplaceListRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/replaceTextList/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentTextReplaceResponse) ApiInvoker.deserialize(response, "", DocumentTextReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostPageReplaceText
	* Page's replace text method.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param storage	String	
	* @param folder	String	
	* @param body	TextReplace	
	* @return PageTextReplaceResponse
	*/

  public PageTextReplaceResponse PostPageReplaceText (String name, Integer pageNumber, String storage, String folder, TextReplace body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || pageNumber == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/replaceText/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (PageTextReplaceResponse) ApiInvoker.deserialize(response, "", PageTextReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostPageReplaceTextList
	* Page's replace text method.
	* @param name	String	
	* @param pageNumber	Integer	
	* @param storage	String	
	* @param folder	String	
	* @param body	TextReplaceListRequest	
	* @return PageTextReplaceResponse
	*/

  public PageTextReplaceResponse PostPageReplaceTextList (String name, Integer pageNumber, String storage, String folder, TextReplaceListRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || pageNumber == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/pdf/{name}/pages/{pageNumber}/replaceTextList/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(pageNumber!=null)
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (PageTextReplaceResponse) ApiInvoker.deserialize(response, "", PageTextReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }

