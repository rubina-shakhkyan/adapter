package com.patterns.pattern.adapter;

import com.patterns.pattern.adapter.iteration.ElementsPrinter;
import com.patterns.pattern.adapter.iteration.IteratorEnumerationAdapter;
import com.patterns.pattern.adapter.mail.ExchangeGoogleMailServerAdapter;
import com.patterns.pattern.adapter.mail.OutlookClient;
import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServerTest;
import com.patterns.pattern.adapter.mail.google.GoogleMailServerTest;
import com.patterns.run.PatternRunner;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import static java.lang.System.out;

public class AdapterRunner implements PatternRunner {

    @Override
    public void run() {
        out.println("Demoing email adapter");
        demoAdapterEmail();
        out.println("\nDemoing iteration adapter");
        demoAdapterIterator();
    }

    private static void demoAdapterEmail() {
        out.println("\nOutlook client using exchange email server");
        OutlookClient outlookClient = new OutlookClient(new ExchangeMailServerTest());
        outlookClient.performEmailActivity();

        out.println("\nOutlook client using google email server");
        ExchangeGoogleMailServerAdapter exchangeGoogleMailServerAdapter = new ExchangeGoogleMailServerAdapter(new GoogleMailServerTest());
        OutlookClient outlookClient2 = new OutlookClient(exchangeGoogleMailServerAdapter);
        outlookClient2.performEmailActivity();
    }

    private static void demoAdapterIterator() {
        out.println("\nElements printer using iterator");
        Iterator<Integer> elements = getElements(1, 2, 3, 4, 5);
        ElementsPrinter elementsPrinter = new ElementsPrinter(elements);
        elementsPrinter.printElements();

        out.println("\nElements printer using enumeration");
        Enumeration<Integer> elements2 = getElements2(1, 2, 3, 4, 5);
        IteratorEnumerationAdapter iteratorEnumerationAdapter = new IteratorEnumerationAdapter(elements2);
        ElementsPrinter elementsPrinter2 = new ElementsPrinter(iteratorEnumerationAdapter);
        elementsPrinter2.printElements();
    }

    private static Iterator<Integer> getElements(Integer... elements) {
        return List.of(elements).iterator();
    }

    private static Enumeration<Integer> getElements2(Integer... elements) {
        return new Vector<>(
                List.of(elements)
        ).elements();
    }

}