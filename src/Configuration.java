public class Configuration implements IConfiguration{
    
    private static IConfiguration configuration = null;
    private Configuration(){
    }

    public static IConfiguration getConfiguration(){
      if(configuration==null){
          configuration = new Configuration();
      }
      return configuration;
    }

    @Override
    public String getUser() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPassWord() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getUrl() {
        // TODO Auto-generated method stub
        return null;
    }


}
