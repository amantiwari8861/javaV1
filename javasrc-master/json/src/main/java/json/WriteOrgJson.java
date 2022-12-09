package json;

import org.json.JSONObject;

// tag::main[]
public class WriteOrgJson {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "robinParse").		// <1>
			put("Version", "1.2.3").
			put("Class", "RobinParse");
		String printable = jsonObject.toString();	// <2>
		System.out.println(printable);
	}
}
// end::main[]
