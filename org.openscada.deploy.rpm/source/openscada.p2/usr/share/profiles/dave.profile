p2.create dave
p2.install dave org.openscada.deploy.feature.group com.inavare.projects.ossi.feature.group

uninstall org.openscada.ca.jdbc.default
uninstall org.openscada.ae.server.storage.jdbc.configuration
uninstall org.openscada.da.server.opc
uninstall org.openscada.da.server.stock
uninstall org.openscada.da.server.ice
uninstall org.openscada.da.server.sysinfo
uninstall org.openscada.da.server.proxy
uninstall org.openscada.da.server.snmp
uninstall org.openscada.da.server.exec
uninstall org.openscada.da.server.simulation
uninstall org.openscada.da.server.simulation.component
uninstall org.openscada.da.server.test
uninstall org.openscada.da.server.spring
uninstall org.openscada.da.server.jdbc

start org.openscada.da.server.osgi.exporter.net
start org.openscada.da.server.common.osgi
start org.openscada.ca.servlet.jaxws
start org.openscada.ca.servlet
start org.openscada.ca.jdbc
start org.openscada.utils.osgi.jaxws
start org.openscada.da.server.osgi
start org.openscada.da.server.dave

openscada.da.net.exportUri=da:net://0.0.0.0:12023
org.openscada.utils.osgi.jaxws.baseAddress=http://0.0.0.0:9241
org.openscada.ca.file.root=/home/jens/cas/dave_full
org.openscada.ca.jdbc.url=jdbc:postgresql://localhost/ca_master
org.openscada.ds.storage.file.root=/home/jens/ds/dave_full
org.openscada.ca.jdbc.password=test12
org.openscada.ca.jdbc.username=jens
org.openscada.ae.server.storage.jdbc.password=test12
org.openscada.ae.server.storage.jdbc.username=jens

