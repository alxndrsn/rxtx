/*--------------------------------------------------------------------------
|   Zystem is a native interface for message reporting in java.
|   Copyright 1997-2004 by Trent Jarvi taj@www.linux.org.uk.
|
|   This library is free software; you can redistribute it and/or
|   modify it under the terms of the GNU Lesser General Public
|   License as published by the Free Software Foundation; either
|   version 2.1 of the License, or (at your option) any later version.
|
|   This library is distributed in the hope that it will be useful,
|   but WITHOUT ANY WARRANTY; without even the implied warranty of
|   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
|   Lesser General Public License for more details.
|
|   The following has been added to allow RXTX to be distributed with Sun
|   Microsystem's CommAPI library as suggested by the FSF.
|
|   http://www.fsf.org/licenses/gpl-faq.html#LinkingOverControlledInterface
|
|   A program that contains no derivative of any portion of RXTX, but
|   is designed to work with RXTX by being compiled or linked with it,
|   is considered a "work that uses the Library" subject to the terms and
|   conditions of the GNU Lesser General Public License.
|
|   As a special exception, the copyright holders of RXTX give you
|   permission to link RXTX with independent modules that communicate with
|   RXTX solely through the Sun Microsytems CommAPI interface, regardless of
|   the license terms of these independent modules, and to copy and distribute
|   the resulting combined work under terms of your choice, provided that
|   every copy of the combined work is accompanied by a complete copy of
|   the source code of RXTX (the version of RXTX used to produce the
|   combined work), being distributed under the terms of the GNU Lesser General
|   Public License plus this exception.  An independent module is a
|   module which is not derived from or based on RXTX.
|
|   Note that people who make modified versions of RXTX are not obligated
|   to grant this special exception for their modified versions; it is
|   their choice whether to do so.  The GNU Lesser General Public License
|   gives permission to release a modified version without this exception; this
|   exception also makes it possible to release a modified version which
|   carries forward this exception.
|
|   You should have received a copy of the GNU Lesser General Public
|   License along with this library; if not, write to the Free
|   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
--------------------------------------------------------------------------*/
package gnu.io;
import javax.comm.*;
import java.util.*;

/**
* Exception thrown when a method does not support the requested functionality.
* @author Trent Jarvi
* @version %I%, %G%
* @since JDK1.0
*/

public class UnSupportedLoggerException extends Exception
{
/**
* create an instances with no message about why the Exception was thrown.
* @since JDK1.0
*/
	public UnSupportedLoggerException()
	{
		super();
	}
/**
* create an instance with a message about why the Exception was thrown.
* @param str	A detailed message explaining the reason for the Exception.
* @since JDK1.0
*/
	public UnSupportedLoggerException( String str )
	{
		super( str );
	}
}
