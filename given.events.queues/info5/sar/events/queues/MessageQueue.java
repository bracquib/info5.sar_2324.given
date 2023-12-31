/*
 * Copyright (C) 2023 Pr. Olivier Gruber                                    
 *                                                                       
 * This program is free software: you can redistribute it and/or modify  
 * it under the terms of the GNU General Public License as published by  
 * the Free Software Foundation, either version 3 of the License, or     
 * (at your option) any later version.                                   
 *                                                                       
 * This program is distributed in the hope that it will be useful,       
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         
 * GNU General Public License for more details.                          
 *                                                                       
 * You should have received a copy of the GNU General Public License     
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */
package info5.sar.events.queues;

public abstract class MessageQueue {
  abstract public QueueBroker broker();

  // added to help debug applications;
  public abstract String getRemoteName();

  public interface Listener {
    void received(byte[] msg);
    void closed();
  }
  public abstract void setListener(Listener l);
  
  public abstract boolean send(byte[] bytes);

  public abstract void close();
  public abstract boolean closed();
}
