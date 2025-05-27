from flask import Flask, request, jsonify
from transformers import pipeline

app = Flask(__name__)
summarizer = pipeline("summarization", model="t5-small")

@app.route('/summarize', methods=['POST'])
def summarize():
    content = request.get_json()
    paragraph = content['text']
    summary = summarizer(paragraph, do_sample=False)
    return jsonify(summary[0]['summary_text'])

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
