package com.hhx.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.hhx.designpattern.factory.SMSSender;
import com.hhx.designpattern.factory.Sender;

public class Builder {
	
private List<Sender> list = new ArrayList<Sender>();

public void produceSMSSender(int count){
	for(int i=0;i<count;i++){
		list.add(new SMSSender());
	}
}

public static void main(String[] args) {
	
	Builder builder = new Builder();
	
	builder.produceSMSSender(10);
	
}

}
