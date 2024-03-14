class FabricaPuma implements FabricaDeCamisas {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}