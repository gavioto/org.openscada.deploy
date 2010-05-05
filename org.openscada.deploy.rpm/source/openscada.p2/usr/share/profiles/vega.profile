p2.create vega
p2.install vega org.openscada.deploy.feature.group com.inavare.projects.ossi.feature.group

uninstall org.openscada.ca.jdbc.default
uninstall org.openscada.ae.server.storage.jdbc.configuration
uninstall org.openscada.da.server.opc
uninstall org.openscada.da.server.stock
uninstall org.openscada.da.server.ice
uninstall org.openscada.da.server.sysinfo
uninstall org.openscada.da.server.proxy
uninstall org.openscada.da.server.snmp
uninstall org.openscada.da.server.dave
uninstall org.openscada.da.server.exec
uninstall org.openscada.da.server.simulation
uninstall org.openscada.da.server.simulation.component
uninstall org.openscada.da.server.test
uninstall org.openscada.da.server.spring
uninstall org.openscada.da.server.jdbc
uninstall org.openscada.ca.jdbc.default

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
start org.openscada.ca.servlet.jaxws
start org.openscada.ca.servlet
start org.openscada.ca.jdbc
start org.openscada.ds.storage.file
start org.openscada.utils.osgi.jaxws
start org.openscada.da.server.osgi
start com.inavare.da.driver.vega
start org.springframework.osgi.extender
start org.openscada.sec.provider.dummy

openscada.da.net.exportUri=da:net://0.0.0.0:12025
org.openscada.utils.osgi.jaxws.baseAddress=http://0.0.0.0:9242
org.openscada.ds.storage.file.root=/home/jens/ds/vega_full
org.eclipse.equinox.http.jetty.http.port=8084
org.openscada.ca.jdbc.instance=vega

