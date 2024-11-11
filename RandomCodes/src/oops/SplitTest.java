package oops;

public class SplitTest {

	public static void main(String[] args) {
		
//		String str = "Souradip@Mitra";
//		
//		String [] arr = str.split("@",2);
//		
////		for (String a : arr)
//            System.out.println(arr[1]);
            
            String xmlString = "<int:fiAPI><fiAPI xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://integration.fiapi.com\">\r\n"
    				+ "  <fiHeader Version=\"2.0\">\r\n"
    				+ "    <Service Version=\"1.0\" Name=\"WireXchange\">\r\n"
    				+ "      <DateTime>2022-12-05T21:52:03.0575367Z</DateTime>\r\n"
    				+ "      <UUID>5EBB42B3-2D1C-4C05-8899-C9CD805A8F4E</UUID>\r\n"
    				+ "    </Service>\r\n"
    				+ "    <Security>\r\n"
    				+ "      <AuthenticationMaterial>\r\n"
    				+ "        <SignedToken>\r\n"
    				+ "          <EncryptedData>\r\n"
    				+ "            <CipherData xmlns=\"http://www.w3.org/2001/04/xmlenc#\">\r\n"
    				+ "              <CipherValue>fgy3YQhCxdi7rI2FeWNX8UzZdSQaput7VV/XnPu8ek4kAksYQUYvUXIolFCeiAUqPst80wuUqO0IjYEfMY3eXw==</CipherValue>\r\n"
    				+ "            </CipherData>\r\n"
    				+ "          </EncryptedData>\r\n"
    				+ "        </SignedToken>\r\n"
    				+ "      </AuthenticationMaterial>\r\n"
    				+ "      <PrincipalID>322274527</PrincipalID>\r\n"
    				+ "    </Security>\r\n"
    				+ "    <Client Version=\"1.3.0\">\r\n"
    				+ "      <VendorID>BANC</VendorID>\r\n"
    				+ "      <AppID>WLS</AppID>\r\n"
    				+ "      <OrgID>WHL</OrgID>\r\n"
    				+ "      <SessionID />\r\n"
    				+ "    </Client>\r\n"
    				+ "    <DataSource>\r\n"
    				+ "      <URI />\r\n"
    				+ "    </DataSource>\r\n"
    				+ "  </fiHeader>\r\n"
    				+ "  <Request TypeOfRequest=\"fiWireInquiry\" RequestID=\"1\" Echo=\"false\">\r\n"
    				+ "    <ResponseDataRequired>3</ResponseDataRequired>\r\n"
    				+ "    <WireDirection>O</WireDirection>\r\n"
    				+ "    <Account>2030040283</Account>\r\n"
    				+ "    <AccountType>GL</AccountType>\r\n"
    				+ "    <FromDate>12/5/2022 12:00:00 AM</FromDate>\r\n"
    				+ "  </Request>\r\n"
    				+ "</fiAPI></int:fiAPI>";
		
            String segment[] = xmlString.split("<fiAPI"); 
            
            String str = segment[1];
            String segment1[] = str.split("</int"); 
            
//            for (String a : segment)
//                System.out.println(a);
            
            System.out.println(segment1[0]);
		

	}

}
