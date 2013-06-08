package com.mkyong.common;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "richFaceCalendar")
public class RichFaceCalendar implements Serializable {

	private Date selectedDate;
	private TimeZone timeZone;
	private String displayDate;

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public TimeZone getTimeZone() {
		return TimeZone.getDefault();
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public String getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}

	public String execute() {
		System.out.println(selectedDate);
		DateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		displayDate = dateFormat.format(selectedDate);
		return "welcome1";
	}

}
