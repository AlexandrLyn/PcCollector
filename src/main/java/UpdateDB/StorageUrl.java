package UpdateDB;

public abstract class StorageUrl {
    protected String[] gpu;
    protected String[] motherBoard;
    protected String[] ram;
    protected String[] cpu;
    protected String[] blockPower;
    protected String[] casePc;
    protected String[] hdd;
    protected String[] ssd;
    protected String[] cooling;
    protected String partLinkGpu = "https://r-seven.ru/catalog/video/videokarta_";
    protected String partLinkMotherBoard = "https://r-seven.ru/catalog/motherboard/materinskaya_plata_";
    protected String partLinkCpu = "https://r-seven.ru/catalog/processor/protsessor_";


    protected abstract String[] gpuUrl();
    protected abstract String[] motherBoardUrl();
    protected abstract String[] ramUrl();
    protected abstract String[] cpuUrl();
    protected abstract String[] blockPowerUrl();
    protected abstract String[] casePcUrl();
    protected abstract String[] hddUrl();
    protected abstract String[] ssdUrl();
    protected abstract String[] coolingUrl();
}
