package clinicmanagement;

import org.json.simple.JSONObject;

public interface IManagementDoctor 
{
	JSONObject byId(JSONObject jsonObject,Object id);
	JSONObject bySpecilization(JSONObject jsonObject,Object Specilization );
	JSONObject byAvailability(JSONObject jsonObject, Object Availability);
	JSONObject byName(JSONObject jsonObject, Object name);
}