package tv;

//import sun.jvm.hotspot.ui.tree.BooleanTreeNodeAdapter;

public  class Remote implements TvControl {
	boolean power;

	      boolean muted;
	      int MIN_CHANNEL = 2;
	      int MAX_CHANNEL = 10;
	      int channel;
	      int MIN_VOLUME = 0;
	      int MAX_VOLUME = 10;
	       int volume;
	       boolean checkMute = true;

	@Override
	public void onPower(){
		boolean power = false;
		        muted = false;
		       // channel =MIN_CHANNEL;
		        volume = MIN_VOLUME;

	}
	public boolean getPower()
	    {

	        return power;
	    }
	public boolean getMuted()
	    {

	        return muted;
	
	    }


     @Override
   public void offPower()  {
    	 if (power)
    		  muted = muted;
    		
          else
    		     power =! power;
    System.out.println(power);
     }
     @Override
     public void VolumeUp() {
    	 if (power)
    		         {
    	
    		           if (muted == checkMute)
    	
    		           {
    		               volume = MAX_VOLUME;
    		           }
    		         else
    	
    		             volume++;
    		 }
    	 System.out.println(+volume);
     }
     @Override
     public void VolumeDown() {
    	 if (power)
    		         {
    	
    		           if (muted == checkMute)
    		 
    		               volume = MIN_VOLUME;
    		
    		
    		         else
    		
  
    		              volume--;
    		         }
    	 System.out.println(+volume);
    		     }
    	 
     }
     
