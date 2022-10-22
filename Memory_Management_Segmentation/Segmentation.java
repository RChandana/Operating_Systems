package segmentation;
public class Segment {
	long size;
	String unit;
	long base;
	long limit;
	String limit_Unit;
	public Segment() {
		this.size = -1;
		this.unit = null;
		this.base = -1;
		this.limit = -1;
	}
	public void clear_All() {
		size = -1;
		unit = null;
		base = -1;
		limit = -1;
	}
	public long get_Size() {
		return size;
	}
	public void set_Size(long size) {
		this.size = size;
	}
	public String get_Unit() {
		return unit;
	}
	public void set_Unit(String unit) {
		this.unit = unit;
	}
	public long get_Base() {
		return base;
	}
	public void set_Base(long base) {
		this.base = base;
	}
