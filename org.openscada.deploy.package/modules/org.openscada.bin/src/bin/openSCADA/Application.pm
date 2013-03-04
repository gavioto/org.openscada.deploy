package openSCADA::Application;

use strict;
use vars qw($VERSION @ISA @EXPORT @EXPORT_OK);

require openSCADA::Base;

require Exporter;

#@ISA = qw(Exporter AutoLoader);
# Items to export into callers namespace by default. Note: do not export
# names by default without a very good reason. Use EXPORT_OK instead.
# Do not simply export all your public functions/methods/constants.
@EXPORT = qw(
);
$VERSION = '0.02';

sub new {
    my $class = shift;

    my $self = {};
    
    $self->{'cmd'} = shift;
    $self->{'args'} = [];
    
    bless $self, $class;
    
    return $self;
}

sub verbose {
  my $self = shift;
  if (@_) {
    $self->{'verbose'} = shift;
  }
  return $self->{'verbose'};
}

sub debug {
  my $self = shift;
  if (@_) {
    $self->{'debug'} = shift;
  }
  return $self->{'debug'};
}

sub setArgs {
  my $self = shift;
  $self->{'args'} = \@_; 
}

sub appendArgs {
  my $self = shift;
  push @{$self->{'args'}}, @_;
}

sub gatherArgs {
  my $self = shift;
  return @{$self->{'args'}};
}

sub execCall {
  my $self = shift;

  my @progArgs = $self->gatherArgs ();
  
  if ( $self->debug () )
  {
	  print $self->{'cmd'} . " ";
	  print join ( " ", @progArgs );
	  print "\n";
  }
  
  exec ( $self->{'cmd'}, @progArgs );

  return; # never reached
}

1;
__END__
