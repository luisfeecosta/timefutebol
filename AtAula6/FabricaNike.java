class FabricaNike implements FabricaDeCamisas {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}