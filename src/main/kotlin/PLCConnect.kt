import com.github.s7connector.api.DaveArea
import com.github.s7connector.api.factory.S7ConnectorFactory


class PLCConnect{

    val ipAddress = "192.168.0.100"
    val rack = 0
    val slot = 2

val plc = S7ConnectorFactory
    .buildTCPConnector()
    .withHost(ipAddress)
    .withRack(rack)
    .withSlot(slot)
    .build()

    fun start(){
        plc.read(DaveArea.DB,100,10,0)
    }

}