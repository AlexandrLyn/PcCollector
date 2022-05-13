package UpdateDB;

import com.example.myfirstapp.HelloController;

public class Updater {
    HelloController helloController = new HelloController();
    public void update(String typePc) {
        if (typePc.equals("Game PC")) {
            StorageUrl storageUrl = new StorageUrlGame();
            UpdaterDB upadterDBgpu = new UpdaterDB("GPU_id", storageUrl.gpuUrl(), "gpugame");
            upadterDBgpu.start();
            UpdaterDB upadterDBblock = new UpdaterDB("BP_id", storageUrl.blockPowerUrl(), "gameblockpower");
            upadterDBblock.start();
            UpdaterDB updaterDBmotherboardgame = new UpdaterDB("board_id", storageUrl.motherBoardUrl(), "motherboardgame");
            updaterDBmotherboardgame.start();
            UpdaterDB updaterDBgamessd = new UpdaterDB("ssd_id", storageUrl.ssdUrl(), "gamessd");
            updaterDBgamessd.start();
            UpdaterDB updaterDBgameRam = new UpdaterDB("ram_id", storageUrl.ramUrl(), "gameram");
            updaterDBgameRam.start();
            UpdaterDB updaterDBgamehdd = new UpdaterDB("hdd_id", storageUrl.hddUrl(), "gamehdd");
            updaterDBgamehdd.start();
            UpdaterDB updaterDBgamecpu = new UpdaterDB("cpu_id", storageUrl.cpuUrl(), "gamecpu");
            updaterDBgamecpu.start();
            UpdaterDB updaterDBgamecooling = new UpdaterDB("cooling_id", storageUrl.coolingUrl(), "gamecooling");
            updaterDBgamecooling.start();
            UpdaterDB updaterDBgamecase = new UpdaterDB("case_id", storageUrl.casePcUrl(), "gamecase");
            updaterDBgamecase.start();
        } else {
            System.out.println("Офисный планктон");
        }
    }
}
