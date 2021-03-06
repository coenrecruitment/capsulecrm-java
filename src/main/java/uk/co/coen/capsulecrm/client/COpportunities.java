package uk.co.coen.capsulecrm.client;

import com.google.common.collect.ImmutableSet;

import java.util.Iterator;
import java.util.List;

public class COpportunities implements Iterable<COpportunity> {
    public List<COpportunity> opportunities;

    public COpportunities(List<COpportunity> opportunities) {
        this.opportunities = opportunities;
    }

    @Override
    public Iterator<COpportunity> iterator() {
        return opportunities != null ? opportunities.iterator() : ImmutableSet.<COpportunity>of().iterator();
    }
}
