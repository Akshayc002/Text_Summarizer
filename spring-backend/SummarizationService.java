@Service
public class SummarizationService {

    public String summarize(String paragraph) {
        return callPythonService(paragraph);
    }

    private String callPythonService(String paragraph) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:5000/summarize";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String json = String.format("{\"text\": \"%s\"}", paragraph.replace("\"", "\\\""));
        HttpEntity<String> request = new HttpEntity<>(json, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        return response.getBody();
    }
}
