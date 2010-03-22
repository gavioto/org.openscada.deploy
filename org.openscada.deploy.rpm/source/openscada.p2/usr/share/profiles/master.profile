
uninstall org.openscada.ca.jdbc.default
uninstall org.openscada.ae.server.storage.jdbc.configuration
uninstall org.openscada.da.server.opc
uninstall org.openscada.da.server.stock
uninstall org.openscada.da.server.ice
uninstall org.openscada.da.server.sysinfo
uninstall org.openscada.da.server.proxy
uninstall org.openscada.da.server.dave
uninstall org.openscada.da.server.snmp
uninstall org.openscada.da.server.exec
uninstall org.openscada.da.server.simulation
uninstall org.openscada.da.server.simulation.component
uninstall org.openscada.da.server.test
uninstall org.openscada.da.server.spring
uninstall org.openscada.da.server.jdbc

start org.openscada.da.server.osgi.exporter.net
start org.openscada.da.client.net
start org.openscada.da.server.common.osgi
start org.openscada.da.connection.provider
start org.openscada.da.client.connection.service
start org.openscada.da.master.analyzer
start org.openscada.da.master.common
start org.openscada.da.datasource.script
start org.openscada.da.datasource.memory
start org.openscada.da.datasource.proxy
start org.openscada.da.datasource.item
start org.openscada.da.datasource.sum
start org.openscada.da.datasource.ds
start org.openscada.ca.servlet.jaxws
start org.openscada.ca.servlet
start org.openscada.ca.file
start org.openscada.ds.storage.file
start org.openscada.utils.osgi.jaxws
start org.openscada.ae.event.logger
start org.openscada.ae.server.storage
start org.openscada.ae.server.exporter.net
start org.openscada.ae.event
start org.openscada.ae.server.net
start org.openscada.ae.monitor.dataitem
start org.openscada.ae.server.exporter
start org.openscada.ae.connection.provider
start org.openscada.ae.server.common
start org.openscada.ae.server.storage.jdbc
start org.openscada.ae.monitor.common
start org.openscada.ae.server.common.condition
start org.openscada.ae.monitor
start org.openscada.ae.server.common.event
start org.openscada.da.server.osgi


openscada.da.net.exportUri=da:net://0.0.0.0:12040
org.openscada.utils.osgi.jaxws.baseAddress=http://0.0.0.0:9240
org.openscada.ca.file.root=/home/jens/cas/master_full
org.openscada.ca.jdbc.url=jdbc:postgresql://localhost/ca_master
org.openscada.ds.storage.file.root=/home/jens/ds/master_full
org.openscada.ca.jdbc.password=test12
org.openscada.ca.jdbc.username=jens
org.openscada.ae.server.storage.jdbc.password=test12
org.openscada.ae.server.storage.jdbc.username=jens

