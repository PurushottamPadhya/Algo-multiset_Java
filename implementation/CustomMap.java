package implementation;

public class CustomMap{

  private String key;
  private int    value;

      public CustomMap(){
        
      }
      public void setValueForKey(String value, int key){
        this.key = key;
        this.value = value;
      }

      public int getValue(){

        return this.value;

      }

      public String getKey(){
        return this.key;
      }


}
