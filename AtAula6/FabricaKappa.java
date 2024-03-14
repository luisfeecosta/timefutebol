class FabricaKappa implements FabricaDeCamisas {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}
