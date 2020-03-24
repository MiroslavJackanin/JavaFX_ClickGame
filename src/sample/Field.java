package sample;

import java.util.Random;

public class Field {
    private Tile[][] tiles;

    public Field() {
        initializeTiles();
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public String getTile(int i, int j){
        return Integer.toString(tiles[i][j].getValue());
    }

    public int getTileVal(int i, int j){
        return tiles[i][j].getValue();
    }

    private void initializeTiles() {
        tiles = new Tile[4][4];
        Random random = new Random();
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles.length; j++){
                tiles[i][j] = new Tile(random.nextInt(6)+5);
            }
        }
    }

    public void decrementTile(int a, int b){
        tiles[a][b].setValue(tiles[a][b].getValue()-1);
    }
    public void incrementTile(int a, int b){
        tiles[a][b].setValue(tiles[a][b].getValue()+1);
    }
}
