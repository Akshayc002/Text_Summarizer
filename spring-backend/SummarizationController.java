@RestController
@RequestMapping("/api")
public class SummarizationController {

    @Autowired
    private SummarizationService summarizationService;

    @PostMapping("/summarize")
    public ResponseEntity<String> summarize(@RequestBody Map<String, String> request) {
        String paragraph = request.get("text");
        String summary = summarizationService.summarize(paragraph);
        return ResponseEntity.ok(summary);
    }
}
