public class ConfigurationImp implements Configuration{
    
    private static ConfigurationImp configuration = null;
    private ConfigurationImp(){
    }

    public static ConfigurationImp getConfiguration(){
      if(configuration==null){
          configuration = new ConfigurationImp();
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
