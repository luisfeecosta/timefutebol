class FabricaUmbro implements FabricaDeCamisas {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }
}