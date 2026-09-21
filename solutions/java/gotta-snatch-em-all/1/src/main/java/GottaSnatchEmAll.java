import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
    Set<String> bloke = new HashSet<>(cards);
    return bloke;
}

    static boolean addCard(String card, Set<String> collection) {
        boolean addC= false;
    if(!collection.contains(card)){
     collection.add(card);
        addC= true;
    }
     
        return addC;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean val = !myCollection.equals(theirCollection);
        val= !myCollection.containsAll(theirCollection)&& !theirCollection.containsAll(myCollection);
    return val;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
    Set<String> common = new HashSet<>(collections.get(0));

    for (Set<String> collection : collections) {
        common.retainAll(collection);
    }

    return common;
}
    

    static Set<String> allCards(List<Set<String>> collections) {
    Set<String> all = new HashSet<>(collections.get(0));
        
        for (Set<String> collection : collections) {
        all.addAll(collection);
    }
        return all;
    }
}
