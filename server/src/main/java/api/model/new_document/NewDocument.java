package api.model.new_document;

public class NewDocument {
    private String doc_id;
    private long seq_no; // uint64 in proto
    private NewDocumentData data;
    private double score;
    private long range_id;
    private long expire_time;

    public NewDocument(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public long getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(long seq_no) {
        this.seq_no = seq_no;
    }

    public NewDocumentData getData() {
        return data;
    }

    public void setData(NewDocumentData data) {
        this.data = data;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getRange_id() {
        return range_id;
    }

    public void setRange_id(long range_id) {
        this.range_id = range_id;
    }

    public long getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(long expire_time) {
        this.expire_time = expire_time;
    }
}
