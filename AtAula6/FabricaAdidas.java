class FabricaAdidas implements FabricaDeCamisas {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}