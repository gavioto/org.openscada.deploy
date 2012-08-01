package TH4::Base;

use strict;
use vars qw($VERSION @ISA @EXPORT @EXPORT_OK);

require Exporter;
require Carp;

@ISA = qw(Exporter AutoLoader);
# Items to export into callers namespace by default. Note: do not export
# names by default without a very good reason. Use EXPORT_OK instead.
# Do not simply export all your public functions/methods/constants.
@EXPORT = qw(
);
$VERSION = '0.03';

sub classpath () {
   my @classpath = ();
   
   my $where = home() . "/jar";
   my $next;
   while (defined($next = <$where/*.jar>)) {
     if ( -r $next ) 
     {
       push @classpath, $next;    
     }
   }
   return @classpath;
}

sub home () {
  Carp::croak ( "'TH4_HOME' not set") unless $ENV{"TH4_HOME"};
  return $ENV{'TH4_HOME'};
}

sub configurationRoot () {
  return $ENV{'TH4_CONFIGURATION_ROOT'} if $ENV{'TH4_CONFIGURATION_ROOT'};
  return "/etc/openscada";
}

1;
__END__
