package Java.DesignPatterns.StructuralPattern;

interface ThirdPartyDownloadLib{
    public void listVideos();
    public void getViewDownloadInfo();
    public void downloadVideo();
}

class ThirdPartyDownloadClass implements ThirdPartyDownloadLib{
    @Override
    public void listVideos() {

    }

    @Override
    public void getViewDownloadInfo() {

    }

    @Override
    public void downloadVideo() {

    }
}

class ProxyThirdPartyDownloadClass implements ThirdPartyDownloadLib{

    ThirdPartyDownloadLib thirdPartyDownloadLib;

    ProxyThirdPartyDownloadClass(ThirdPartyDownloadLib thirdPartyDownloadLib){
        this.thirdPartyDownloadLib = thirdPartyDownloadLib;
    }

    @Override
    public void listVideos() {
        // Implementing code
        thirdPartyDownloadLib.listVideos();
    }

    @Override
    public void getViewDownloadInfo() {
        thirdPartyDownloadLib.getViewDownloadInfo();
    }

    @Override
    public void downloadVideo() {
        thirdPartyDownloadLib.downloadVideo();
    }
}

public class ProxyMethod {
    public static void main(String[] args){
        ThirdPartyDownloadLib thirdPartyDownloadLib = new ThirdPartyDownloadClass();
        ProxyThirdPartyDownloadClass proxyThirdPartyDownloadClass = new ProxyThirdPartyDownloadClass(thirdPartyDownloadLib);
        proxyThirdPartyDownloadClass.downloadVideo();
        proxyThirdPartyDownloadClass.listVideos();
        proxyThirdPartyDownloadClass.getViewDownloadInfo();
    }
}
