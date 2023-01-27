package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMainClass {

	/*
	 	XML
	 	1. eXtensible Markup Language
	 	2. HTML(표준 마크업 언어)의 확장 버전
	 	3. 정해진 태그 외 사용자 정의 태크의 사용이 가능하다.
	 	
	 	목표.
		1. 경로
			C:\storage\product.xml   ※product.xml 이거(문서)전체를 document라고 부름
		2. 내용
		   <products>				 ※<products> 이런 모양을 element(태그와 태그의끝)라고 부르고 이 element의 부모는 document
		   		<product>
		   			<model>세탁기</model>  		※"세탁기"같은 텍스트를 textContent라고 부름
		   			<maker>삼성</maker>
		   			<price>100</price>
		   		</product>
		   </products>
		   <products>
		   		<product>
		   			<model>냉장고</model>
		   			<maker>LG</maker>
		   			<price>200</price>
		   		</product>
		   </products>
		   <products>
		   		<product>
		   			<model>TV</model>
		   			<maker>삼성</maker>
		   			<price>300</price>
		   		</product>
		   </products>				※이런 처리방식을 dom(document object model, 문서를 객체화시키는 모델)이라고 한다 문서자체를 각각의 객체로 본다
	 */
	
	public static void main(String[] args) {

		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);

		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model", "TV");
		product3.put("maker", "삼성");
		product3.put("price", 300);
		
		List<Map<String, Object>> productList = Arrays.asList(product1, product2, product3);
		
		try {
			
			//Document 생성(Document는 XML문서 자체를 의미한다.)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			document.setXmlStandalone(true); //standalone="no" 제거하기
			
			//<products> 태그 : Element 생성
			Element products = document.createElement("products");
			document.appendChild(products);
			
			//productList 순회
			for(Map<String, Object> map : productList) {
				
				//<product> 태그 : Element 생성
				Element product = document.createElement("products");
				products.appendChild(product);
				
				//<model> 태그 : Element 생성
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent((String)map.get("model"));
				
				//<maker> 태그 : Element 생성
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent((String)map.get("maker"));
				
				//<price> 태그 : Element 생성
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent((int)map.get("price") + "");   //setTextContent은 무조건 String 타입이다
				
			}
			
			//XML 설정
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("encoding", "UTF-8");
			transformer.setOutputProperty("indent", "yes"); //들여쓰기
			transformer.setOutputProperty("doctype-public", "yes");  // standalone="no" 제거하기 위해서 document.setXmlStandalone(true);를 추가하면 개행(줄바꿈)이 안 되므로 추가한 코드
			
			//XML 문서 만들기
			File dir = new File("C:" + File.separator + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "product.xml");
			Source source = new DOMSource(document);
			StreamResult streamResult = new StreamResult(file);
			transformer.transform(source, streamResult);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
