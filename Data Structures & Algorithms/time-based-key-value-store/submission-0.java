class TimeMap {
    private Map<String,List<pair<Integer,String>>> keyStore;
    public TimeMap() {
        keyStore=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        keyStore.computeIfAbsent(key,k->new ArrayList<>())
             .add(new pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        List<pair<Integer,String>> values=keyStore.getOrDefault(key,
        new ArrayList<>());
        int l=0;
        int r=values.size()-1;
        String s="";
        while(l<=r){
           int mid=(l+r)/2;
           if(values.get(mid).getKey()<=timestamp){
             s=values.get(mid).getValue();
             l=mid+1;
           }
           else{
            r=mid-1;
           }
        }
        return s;
    }
    private class pair<K,V>{
        private  final K key;
        private  final V value;
        pair(K k,V v){
            this.key=k;
            this.value=v;
        }
        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }
}
